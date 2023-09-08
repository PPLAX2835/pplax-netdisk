package xyz.pplax.netdisk.core.config;

import com.github.xiaoymin.knife4j.spring.extension.OpenApiExtensionResolver;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * Knife4j配置
 * 访问h{ip}:8080/doc.html#
 */
@Configuration
@EnableSwagger2
public class Knife4jConfiguration {

    private final OpenApiExtensionResolver openApiExtensionResolver;

    @Autowired
    public Knife4jConfiguration(OpenApiExtensionResolver openApiExtensionResolver) {
        this.openApiExtensionResolver = openApiExtensionResolver;
    }


    /**
     * base api docket
     *
     * @return docket
     */
    @Bean(value = "baseApi")
    public Docket baseApi() {
        String groupName = "前台功能";
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("xyz.pplax.netdisk.module"))
                .paths(PathSelectors.ant("/admin/**").negate())
                .build()
                .groupName(groupName)
                .extensions(openApiExtensionResolver.buildExtensions(groupName));
    }


    /**
     * admin api docket
     *
     * @return docket
     */
    @Bean(value = "adminApi")
    public Docket adminApi() {
        String groupName = "管理员功能";
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // 全局请求参数
                .globalRequestParameters(generateRequestParameters())
                .select()
                .apis(RequestHandlerSelectors.basePackage("xyz.pplax.netdisk.module"))
                .paths(PathSelectors.ant("/admin/**"))
                .build()
                .groupName(groupName)
                .extensions(openApiExtensionResolver.buildExtensions(groupName));
    }


    /**
     * 获取通用的全局参数
     *
     * @return  全局参数列表
     */
    private List<RequestParameter> generateRequestParameters(){
        RequestParameterBuilder token = new RequestParameterBuilder();
        List<RequestParameter> parameters = new ArrayList<>();
        token.name("pplax-token").description("token").in(In.HEADER.toValue()).required(true).build();
        parameters.add(token.build());
        return parameters;
    }


    /**
     * api 基本信息描述
     *
     * @return  ApiInfo
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("PPLAX 文档")
                .description("# 这是 PPLAX Restful 接口文档展示页面")
                .termsOfServiceUrl("https://www.pplax.xyz")
                .contact(new Contact("zhaojun", "https://pplax.xyz", "admin@pplax.xyz"))
                .version("1.0")
                .build();
    }

}