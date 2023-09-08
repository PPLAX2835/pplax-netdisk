import{D as F}from"./base.b65bdcd1.js";/* empty css                */import{Z as A,a as B}from"./ZFormItem.f027e70d.js";/* empty css               */import{E as $}from"./input-number.df41d4c6.js";/* empty css              */import{E as M}from"./radio.5a7362d7.js";/* empty css            */import{E as N,a as Z}from"./select.5ac33161.js";import"./scrollbar.117c6324.js";import"./popper.aedd2598.js";import{a as d,f as _,m as t,r as T,w as O,F as L,v as z,j as a,u as e,e as n,b as U,K as w,L as g,t as C,O as r,k as E,P as q,Q as H,R as X}from"./index.965ac11d.js";import{g as W,a as j}from"./unit.5ed4b9cd.js";import{E as K}from"./switch.1ecf928e.js";import{u as Q}from"./useLinkSetting.2b12bf8c.js";import{g as G,t as J}from"./admin-setting.46e4ebbe.js";import{_ as Y}from"./plugin-vue_export-helper.21dcd24c.js";import{E as ee}from"./index.22cf9654.js";import{a as le,r as te}from"./XCircleIcon.af7bde30.js";import{u as oe}from"./index.871a70d2.js";import{v as ae}from"./directive.d58852f6.js";import"./event.776e7e11.js";import"./index.9300971e.js";import"./request.2ccc188b.js";import"./index.94e7820c.js";import"./scroll.06c8f1a5.js";import"./index.c4c36dd3.js";import"./_Uint8Array.4350f927.js";import"./debounce.da5c4ce9.js";import"./validator.58bcb820.js";import"./focus-trap.2030fc87.js";function ne(v,l){return d(),_("svg",{xmlns:"http://www.w3.org/2000/svg",viewBox:"0 0 24 24",fill:"currentColor","aria-hidden":"true"},[t("path",{"fill-rule":"evenodd",d:"M12 2.25a.75.75 0 01.75.75v16.19l6.22-6.22a.75.75 0 111.06 1.06l-7.5 7.5a.75.75 0 01-1.06 0l-7.5-7.5a.75.75 0 111.06-1.06l6.22 6.22V3a.75.75 0 01.75-.75z","clip-rule":"evenodd"})])}function se(v,l){return d(),_("svg",{xmlns:"http://www.w3.org/2000/svg",viewBox:"0 0 24 24",fill:"currentColor","aria-hidden":"true"},[t("path",{"fill-rule":"evenodd",d:"M11.47 2.47a.75.75 0 011.06 0l7.5 7.5a.75.75 0 11-1.06 1.06l-6.22-6.22V21a.75.75 0 01-1.5 0V4.81l-6.22 6.22a.75.75 0 11-1.06-1.06l7.5-7.5z","clip-rule":"evenodd"})])}function re(v,l){return d(),_("svg",{xmlns:"http://www.w3.org/2000/svg",viewBox:"0 0 24 24",fill:"currentColor","aria-hidden":"true"},[t("path",{"fill-rule":"evenodd",d:"M3.75 12a.75.75 0 01.75-.75h15a.75.75 0 010 1.5h-15a.75.75 0 01-.75-.75z","clip-rule":"evenodd"})])}function ie(v,l){return d(),_("svg",{xmlns:"http://www.w3.org/2000/svg",viewBox:"0 0 24 24",fill:"currentColor","aria-hidden":"true"},[t("path",{"fill-rule":"evenodd",d:"M12 3.75a.75.75 0 01.75.75v6.75h6.75a.75.75 0 010 1.5h-6.75v6.75a.75.75 0 01-1.5 0v-6.75H4.5a.75.75 0 010-1.5h6.75V4.5a.75.75 0 01.75-.75z","clip-rule":"evenodd"})])}const ue={class:"flex flex-wrap"},de={class:"flex items-center"},pe=["onClick"],me=["onClick"],ce=["onClick"],_e=["onClick"],fe={class:"ml-3 text-gray-500"},ve={__name:"TimePicker",props:{modelValue:{type:Array,required:!0}},emits:["update:modelValue"],setup(v,{emit:l}){const k=v,u=T(k.modelValue?k.modelValue:[{value:"1",unit:"d",second:86400}]),P=i=>{u.value.splice(i,0,{value:"",unit:"s"})};O(u,i=>{l("update:modelValue",i)});const h=i=>{if(i===0)return;const o=u.value[i];u.value.splice(i,1),u.value.splice(i-1,0,o)},x=i=>{if(i===u.value.length-1)return;const o=u.value[i];u.value.splice(i,1),u.value.splice(i+1,0,o)},I=i=>{u.value.splice(i,1)};return(i,o)=>{const V=$,c=N,y=Z;return d(),_("div",ue,[(d(!0),_(L,null,z(u.value,(b,p)=>(d(),_("div",{key:p,class:"mb-4 w-full"},[t("div",de,[a(V,{modelValue:b.value,"onUpdate:modelValue":m=>b.value=m,min:1,max:e(W)(b.unit),disabled:b.unit==="forever"},null,8,["modelValue","onUpdate:modelValue","max","disabled"]),a(y,{modelValue:b.unit,"onUpdate:modelValue":m=>b.unit=m,"fit-input-width":"",class:"ml-3 w-20"},{default:n(()=>[(d(!0),_(L,null,z(e(j),m=>(d(),U(c,{key:m.value,label:m.label,value:m.value},null,8,["label","value"]))),128))]),_:2},1032,["modelValue","onUpdate:modelValue"]),w(t("button",{type:"button",onClick:m=>h(p),class:"ml-2 py-2 px-2 rounded-md bg-blue-500 text-white hover:bg-blue-600 focus:bg-blue-700 focus:outline-none font-bold"},[a(e(se),{class:"h-4"})],8,pe),[[g,p!==0]]),w(t("button",{type:"button",onClick:m=>x(p),class:"ml-2 py-2 px-2 rounded-md bg-blue-500 text-white hover:bg-blue-600 focus:bg-blue-700 focus:outline-none font-bold"},[a(e(ne),{class:"h-4"})],8,me),[[g,p!==u.value.length-1]]),w(t("button",{type:"button",onClick:m=>P(p+1),class:"ml-2 py-2 px-2 rounded-md bg-blue-500 text-white hover:bg-blue-600 focus:bg-blue-700 focus:outline-none font-bold"},[a(e(ie),{class:"h-4"})],8,ce),[[g,p===u.value.length-1]]),w(t("button",{type:"button",onClick:m=>I(p),class:"ml-2 py-2 px-2 rounded-md bg-red-500 text-white hover:bg-red-600 focus:bg-red-700 focus:outline-none font-bold"},[a(e(re),{class:"h-4"})],8,_e),[[g,u.value.length>1]])]),t("small",fe,C(b.formatted),1)]))),128))])}}};const f=v=>(H("data-v-4c538bb3"),v=v(),X(),v),be={class:"pplax-admin-down-link-body"},he={class:"text-red-400 font-bold"},Ve=f(()=>t("ul",null,[t("li",null,[r("\u9650\u5236\u6CDB\u57DF\u540D "),t("span",{class:"text-red-400"},"http \u534F\u8BAE"),r(" \u5168\u90E8\u5B50\u76EE\u5F55\u53EF\u8BBF\u95EE\uFF1A"),t("div",{class:"inline select-all font-bold"},[t("span",{class:"text-red-400"},"http://"),r("*example.com/**")])]),t("li",null,[r("\u9650\u5236\u6CDB\u57DF\u540D "),t("span",{class:"text-red-400"},"https \u534F\u8BAE"),r(" \u5168\u90E8\u5B50\u76EE\u5F55\u53EF\u8BBF\u95EE\uFF1A"),t("div",{class:"inline select-all font-bold"},[t("span",{class:"text-red-400"},"https://"),r("*example.com/**")])]),t("li",null,[r("\u9650\u5236\u6CDB\u57DF\u540D "),t("span",{class:"text-red-400"},"\u5168\u90E8\u534F\u8BAE"),r(" \u5168\u90E8\u5B50\u76EE\u5F55\u53EF\u8BBF\u95EE\uFF1A"),t("div",{class:"inline select-all font-bold"},[t("span",{class:"text-red-400"},"*://"),r("*example.com/**")])])],-1)),we={key:0},ge={key:1},xe={class:"mt-4"},ye=f(()=>t("div",null,"\u53EF\u5728\u4E0B\u65B9\u8F93\u5165\u4F60\u8981\u6D4B\u8BD5\u7684\u5730\u5740\uFF08\u5E94\u5305\u542B\u534F\u8BAE\uFF0C\u8DEF\u5F84\uFF0C\u4ECE\u6D4F\u89C8\u5668\u5730\u5740\u680F\u590D\u5236\u5C31\u662F\u4E86\uFF09",-1)),ke=f(()=>t("span",null,"\u5355 IP",-1)),Pe=f(()=>t("span",null,"\u79D2\u5185\u5141\u8BB8\u4E0B\u8F7D",-1)),Ie=f(()=>t("span",null,"\u6B21",-1)),Ee=f(()=>t("span",null,"\u8BBE\u7F6E\u76F4\u94FE\u9632\u6B62\u6076\u610F\u4E0B\u8F7D\uFF0C\u5355 IP N \u79D2\u5185\u53EA\u5141\u8BB8\u8BBF\u95EE M \u6B21\u76F4\u94FE\uFF0C\u5982\u5176\u4E2D\u4E00\u4E2A\u4E3A 0 \u5219\u4E0D\u505A\u4EFB\u4F55\u9650\u5236.",-1)),Te=f(()=>t("br",null,null,-1)),Ue=f(()=>t("br",null,null,-1)),Ce=f(()=>t("span",null,"\u6CE8\u610F\uFF1A\u6B64\u529F\u80FD\u5BF9\u76F4\u94FE\u3001\u77ED\u94FE\u90FD\u6709\u6548\uFF0C\u4E14\u5171\u4EAB\u9650\u5236\u6B21\u6570\u3002\u4F46\u76F4\u94FE/\u77ED\u94FE\u8DF3\u8F6C\u540E\u7684\u5B9E\u9645\u4E0B\u8F7D\u94FE\u63A5\u65E0\u6CD5\u9650\u5236\uFF0C\u56E0\u4E3A\u90A3\u4E9B\u94FE\u63A5\u4E0D\u7ECF\u8FC7 PPLAX.",-1)),Le=f(()=>t("br",null,null,-1)),ze=f(()=>t("br",null,null,-1)),$e={class:"text-blue-400"},Re={class:"dialog-footer"},Se={__name:"basic-setting",setup(v){const{data:l,saveData:k,saveLoading:u}=Q(),P=T("");G().then(i=>{P.value=i.data.data});const h=T(""),x=T(null),I=oe(()=>{var o;let i={antPath:(o=l==null?void 0:l.value)==null?void 0:o.refererValue,testPath:h.value};J(i).then(V=>{x.value=V.data.data})},250);return(i,o)=>{const V=K,c=A,y=ee,b=ve,p=M,m=$,R=F,S=B,D=ae;return d(),_("div",be,[e(l)?w((d(),U(S,{key:0,model:e(l),"element-loading-text":"\u4FDD\u5B58\u4E2D..."},{"form-title":n(()=>[r(" \u76F4/\u77ED\u94FE\u8BBE\u7F6E ")]),"form-sub-title":n(()=>[r(" \u8FD9\u91CC\u53EF\u4EE5\u914D\u7F6E\u76F4/\u77ED\u94FE\u76F8\u5173\u8BBE\u7F6E ")]),footer:n(()=>[t("span",Re,[a(R,{type:"primary",onClick:e(k)},{default:n(()=>[r("\u4FDD\u5B58")]),_:1},8,["onClick"])])]),default:n(()=>[a(c,{label:"\u8BB0\u5F55\u4E0B\u8F7D\u65E5\u5FD7"},{tips:n(()=>[r(" \u662F\u5426\u8BB0\u5F55\u76F4/\u77ED\u94FE\u4E0B\u8F7D\u65E5\u5FD7 ")]),default:n(()=>[a(V,{modelValue:e(l).recordDownloadLog,"onUpdate:modelValue":o[0]||(o[0]=s=>e(l).recordDownloadLog=s)},null,8,["modelValue"])]),_:1}),a(c,{label:"\u662F\u5426\u5141\u8BB8\u751F\u6210/\u4F7F\u7528\u76F4\u94FE\uFF08\u8DEF\u5F84\uFF09"},{tips:n(()=>[r(" \u63A7\u5236\u662F\u5426\u751F\u6210\u76F4\u94FE\u65F6\u663E\u793A\u76F4\u94FE\u8DEF\u5F84\u53CA\u662F\u5426\u5141\u8BB8\u4F7F\u7528\u76F4\u94FE\u8FDB\u884C\u4E0B\u8F7D. ")]),default:n(()=>[a(V,{modelValue:e(l).showPathLink,"onUpdate:modelValue":o[1]||(o[1]=s=>e(l).showPathLink=s)},null,8,["modelValue"])]),_:1}),a(c,{label:"\u76F4\u94FE\u5730\u5740\u524D\u7F00"},{tips:n(()=>[r(" \u76F4\u94FE\u5730\u5740\u524D\u7F00, \u5982 http(s)://ip:port/"),t("span",he,C(e(l).directLinkPrefix),1),r("/path/filename ")]),default:n(()=>[a(y,{modelValue:e(l).directLinkPrefix,"onUpdate:modelValue":o[2]||(o[2]=s=>e(l).directLinkPrefix=s)},null,8,["modelValue"])]),_:1}),a(c,{label:"\u662F\u5426\u5141\u8BB8\u4F7F\u7528\u77ED\u94FE"},{tips:n(()=>[r(" \u63A7\u5236\u662F\u5426\u751F\u6210\u76F4\u94FE\u65F6\u663E\u793A\u77ED\u94FE\u8DEF\u5F84\u53CA\u662F\u5426\u5141\u8BB8\u4F7F\u7528\u77ED\u94FE\u8FDB\u884C\u4E0B\u8F7D ")]),default:n(()=>[a(V,{modelValue:e(l).showShortLink,"onUpdate:modelValue":o[3]||(o[3]=s=>e(l).showShortLink=s)},null,8,["modelValue"])]),_:1}),a(c,{label:"\u77ED\u94FE\u6709\u6548\u671F"},{tips:n(()=>[r(" \u63A7\u5236\u751F\u6210\u77ED\u94FE\u7684\u6709\u6548\u671F ")]),default:n(()=>[a(b,{modelValue:e(l).linkExpireTimes,"onUpdate:modelValue":o[4]||(o[4]=s=>e(l).linkExpireTimes=s)},null,8,["modelValue"])]),_:1}),a(c,{label:"Referer \u9632\u76D7\u94FE"},{tips:n(()=>[r(" \u9632\u76D7\u94FE\u652F\u6301\u8BBF\u95EE\u6587\u4EF6\u76F4\u94FE\u6216\u77ED\u94FE\u65F6\u6821\u9A8C\uFF0C\u5982\u7528\u6237\u76F4\u63A5\u8BBF\u95EE\u76F4\u94FE\u8DF3\u8F6C\u540E\u7684\u5B58\u50A8\u6E90\u539F\u59CB\u94FE\u63A5\uFF0C\u65E0\u6CD5\u8FDB\u884C\u6821\u9A8C\u548C\u62E6\u622A\u3002 ")]),default:n(()=>[a(p,{modelValue:e(l).refererType,"onUpdate:modelValue":o[5]||(o[5]=s=>e(l).refererType=s),label:"off"},{default:n(()=>[r("\u4E0D\u542F\u7528 Referer \u9632\u76D7\u94FE")]),_:1},8,["modelValue"]),a(p,{modelValue:e(l).refererType,"onUpdate:modelValue":o[6]||(o[6]=s=>e(l).refererType=s),label:"white_list"},{default:n(()=>[r("\u542F\u7528\u767D\u540D\u5355")]),_:1},8,["modelValue"]),a(p,{modelValue:e(l).refererType,"onUpdate:modelValue":o[7]||(o[7]=s=>e(l).refererType=s),label:"black_list"},{default:n(()=>[r("\u542F\u7528\u9ED1\u540D\u5355")]),_:1},8,["modelValue"])]),_:1}),w(a(c,{label:"Referer \u914D\u7F6E"},{default:n(()=>[a(p,{modelValue:e(l).refererAllowEmpty,"onUpdate:modelValue":o[8]||(o[8]=s=>e(l).refererAllowEmpty=s),label:!0},{default:n(()=>[r("\u5141\u8BB8 Referer \u4E3A\u7A7A")]),_:1},8,["modelValue"]),a(p,{modelValue:e(l).refererAllowEmpty,"onUpdate:modelValue":o[9]||(o[9]=s=>e(l).refererAllowEmpty=s),label:!1},{default:n(()=>[r("\u7981\u6B62 Referer \u4E3A\u7A7A")]),_:1},8,["modelValue"])]),_:1},512),[[g,e(l).refererType!=="no"]]),w(a(c,{label:"\u767D\u540D\u5355"},{tips:n(()=>[r(" \u6BCF\u884C\u8F93\u5165\u4E00\u4E2A\u57DF\u540D\uFF0C\u5982\uFF1A "),Ve,e(l).refererType==="white_list"?(d(),_("div",we," \u6BCF\u884C\u8F93\u5165\u4E00\u4E2A\u57DF\u540D\uFF0C\u9700\u8981\u5199\u534F\u8BAE\u5934\u652F\u6301 * \u901A\u914D\u7B26\uFF0C\u5982\u767D\u540D\u5355 http://*pplax.vip \u5C06\u53EA\u5141\u8BB8 http://pplax.vip\u3001http://www.pplax.vip\u3001http://demo.pplax.vip \u7B49\u7F51\u7AD9\u8BBF\u95EE\u3002 ")):E("",!0),e(l).refererType==="black_list"?(d(),_("div",ge," \u6BCF\u884C\u8F93\u5165\u4E00\u4E2A\u57DF\u540D\uFF0C\u9700\u8981\u5199\u534F\u8BAE\u5934\uFF0C\u652F\u6301 * \u901A\u914D\u7B26\uFF0C\u5982\u9ED1\u540D\u5355 http://*pplax.vip \u5C06\u7981\u6B62\u6240\u6709\u5982 http://pplax.vip\u3001http://www.pplax.vip\u3001http://demo.pplax.vip \u7B49\u7F51\u7AD9\u8BBF\u95EE\u3002 ")):E("",!0),t("div",xe,[ye,a(y,{onInput:e(I),modelValue:e(h),"onUpdate:modelValue":o[11]||(o[11]=s=>q(h)?h.value=s:null)},{suffix:n(()=>[e(h)&&e(x)===!0?(d(),U(e(le),{key:0,class:"w-4 text-green-500"})):e(h)&&e(x)===!1?(d(),U(e(te),{key:1,class:"w-4 text-red-500"})):E("",!0)]),_:1},8,["onInput","modelValue"])])]),default:n(()=>[a(y,{type:"textarea",onInput:e(I),rows:6,modelValue:e(l).refererValue,"onUpdate:modelValue":o[10]||(o[10]=s=>e(l).refererValue=s)},null,8,["onInput","modelValue"])]),_:1},512),[[g,e(l).refererType!=="no"]]),a(c,{label:"\u76F4\u94FE\u4E0B\u8F7D\u9650\u5236"},{tips:n(()=>[Ee,Te,Ue,Ce,Le,ze,t("span",null,[r('\u6CE8\u610F\uFF1A\u5982\u679C\u4F60\u4F7F\u7528\u4E86\u53CD\u5411\u4EE3\u7406\uFF0C\u800C\u4E0D\u662F\u76F4\u63A5\u8BBF\u95EE\u7684 PPLAX \u7AEF\u53E3, \u90A3\u4F60\u9700\u8981\u5728\u53CD\u5411\u4EE3\u7406\u5904\u8BBE\u7F6E\u4EE5\u4E0B\u8BF7\u6C42\u5934\u4E3A\u7528\u6237\u771F\u5B9E IP\uFF1A"X-Forwarded-For", "X-Real-IP", "Proxy-Client-IP", "WL-Proxy-Client-IP", "HTTP_CLIENT_IP", "HTTP_X_FORWARDED_FOR"\uFF0C\u4E0D\u7136\u4E0D\u8BBA\u8C01\u8BBF\u95EE PPLAX \u90FD\u53EA\u80FD\u83B7\u53D6\u5230\u53CD\u4EE3\u670D\u52A1\u5668\u7684 IP\uFF0C\u540C\u670D\u52A1\u5668\u4E00\u822C\u662F\u83B7\u53D6\u5230 127.0.0.1 \u6216 localhost, \u8FD9\u6837\u6B64\u529F\u80FD\u5C31\u65E0\u6CD5\u6B63\u5E38\u4F7F\u7528!!! (\u8F85\u52A9\u4FE1\u606F: \u7CFB\u7EDF\u83B7\u53D6\u5230\u60A8\u5F53\u524D IP \u4E3A '),t("span",$e,C(e(P)),1),r(")")])]),default:n(()=>[ke,a(m,{modelValue:e(l).linkLimitSecond,"onUpdate:modelValue":o[12]||(o[12]=s=>e(l).linkLimitSecond=s),min:0,max:86400,step:1,size:"small",class:"mx-2"},null,8,["modelValue"]),Pe,a(m,{modelValue:e(l).linkDownloadLimit,"onUpdate:modelValue":o[13]||(o[13]=s=>e(l).linkDownloadLimit=s),min:0,max:9999999,step:1,size:"small",class:"mx-2"},null,8,["modelValue"]),Ie]),_:1})]),_:1},8,["model"])),[[D,e(u)]]):E("",!0)])}}};var cl=Y(Se,[["__scopeId","data-v-4c538bb3"]]);export{cl as default};
