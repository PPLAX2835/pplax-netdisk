import{u as p}from"./useFileUpload.a56ef935.js";import{o as d,a as f,f as m,Q as l,R as _,m as u}from"./index.965ac11d.js";import{_ as g}from"./plugin-vue_export-helper.21dcd24c.js";import{E as v}from"./request.2ccc188b.js";import"./common.df582fdd.js";import"./useCommon.eb7f3fe8.js";import"./index.871a70d2.js";import"./base.b65bdcd1.js";import"./checkbox.c90315f5.js";import"./event.776e7e11.js";import"./index.c4c36dd3.js";import"./_Uint8Array.4350f927.js";/* empty css              */import"./index.22cf9654.js";import"./use-outside-click.18deedcf.js";import"./directive.d58852f6.js";import"./XCircleIcon.af7bde30.js";import"./index.0f169a7e.js";import"./index.efd5e5c6.js";import"./scroll.06c8f1a5.js";import"./focus-trap.2030fc87.js";import"./validator.58bcb820.js";const h=t=>(l("data-v-acdcdb0a"),t=t(),_(),t),w={class:"pplax-office-viewer"},y=h(()=>u("div",{id:"office-body"},null,-1)),E=[y],S={__name:"OfficeViewer",props:{fileUrl:String,fileName:String},setup(t){const o=t;let a=p();d(()=>{n(`${a.globalConfig.onlyOfficeUrl}/web-apps/apps/api/documents/api.js`,()=>{const i=o.fileName.lastIndexOf("."),e={document:{fileType:o.fileName.substr(i+1),title:o.fileName,url:o.fileUrl,lang:"zh-CN"},width:"100%",editorConfig:{mode:"view",lang:"zh-CN"}};new DocsAPI.DocEditor("office-body",e)})});function n(i,r){let e=document.createElement("script"),s=document.getElementsByTagName("head")[0];e.type="text/javascript",e.charset="UTF-8",e.src=i,e.addEventListener?(e.addEventListener("load",function(){r()},!1),e.addEventListener("error",function(){v.warning("\u8C03\u7528\u5728\u7EBF\u6587\u6863\u670D\u52A1\u5931\u8D25\uFF0C\u8BF7\u68C0\u67E5\u5728\u7EBF\u6587\u6863\u670D\u52A1\u662F\u5426\u6B63\u5E38")},!1)):e.attachEvent&&e.attachEvent("onreadystatechange",function(){var c=window.event.srcElement;c.readyState==="loaded"&&r()}),s.appendChild(e)}return(i,r)=>(f(),m("div",w,E))}};var q=g(S,[["__scopeId","data-v-acdcdb0a"]]);export{q as default};
