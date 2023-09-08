package xyz.pplax.netdisk.core.config;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * Jackson 枚举反序列化器
 */
@Slf4j
@Setter
@JsonComponent
public class JacksonEnumDeserializer extends JsonDeserializer<Enum<?>> implements ContextualDeserializer {

	private Class<?> clazz;


	/**
	 * 从JSON文本中反序列化为枚举类型的方法。
	 *
	 * @param jsonParser 用于解析JSON数据的JsonParser对象。
	 * @param ctx 反序列化上下文，可以包含有关反序列化过程的其他信息。
	 * @return 反序列化后的枚举对象，如果找不到匹配的枚举对象则返回null。
	 * @throws IOException 如果在JSON解析过程中发生I/O异常。
	 */
	@Override
	public Enum<?> deserialize(JsonParser jsonParser, DeserializationContext ctx) throws IOException {
		// 获取枚举类型
		Class<?> enumType = clazz;

		// 检查枚举类型是否为空或非枚举类型
		if (Objects.isNull(enumType) || !enumType.isEnum()) {
			return null;
		}

		// 从JSON解析器中获取文本
		String text = jsonParser.getText();

		// 获取将字符串转换为枚举值的方法
		Method method = StringToEnumConverterFactory.getMethod(clazz);

		// 获取枚举类型的所有常量
		Enum<?>[] enumConstants = (Enum<?>[]) enumType.getEnumConstants();

		// 将值与枚举对象对应并缓存
		for (Enum<?> e : enumConstants) {
			try {
				// 使用反射调用方法，比较枚举常量的字符串表示与JSON文本
				if (Objects.equals(method.invoke(e).toString(), text)) {
					return e;
				}
			} catch (IllegalAccessException | InvocationTargetException ex) {
				log.error("获取枚举值错误!!! ", ex);
			}
		}
		return null;
	}


	/**
	 * 根据当前上下文创建一个特定枚举类型的JSON反序列化器。
	 *
	 * @param ctx 反序列化上下文，包含有关反序列化过程的信息。
	 * @param property Java Bean 属性，描述了正在反序列化的属性（可以为null）。
	 * @return JSON反序列化器，用于将JSON数据反序列化为指定的枚举类型。
	 */
	@Override
	public JsonDeserializer<Enum<?>> createContextual(DeserializationContext ctx, BeanProperty property) {
		Class<?> rawCls = ctx.getContextualType().getRawClass();
		JacksonEnumDeserializer converter = new JacksonEnumDeserializer();
		converter.setClazz(rawCls);
		return converter;
	}

}