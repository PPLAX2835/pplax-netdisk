!function(){var e=document.createElement("style");e.innerHTML=".pplax-office-viewer[data-v-acdcdb0a],#office-body[data-v-acdcdb0a]{height:100%;width:100%}\n",document.head.appendChild(e),System.register(["./useFileUpload-legacy.a81d91ec.js","./index-legacy.492b6ebd.js","./plugin-vue_export-helper-legacy.7bb61c33.js","./request-legacy.01567c6f.js","./common-legacy.2b8660dc.js","./useCommon-legacy.ff7c2bc7.js","./index-legacy.31b96dde.js","./base-legacy.28cad0e5.js","./checkbox-legacy.dcd6a125.js","./event-legacy.39ad8904.js","./index-legacy.c304ec26.js","./_Uint8Array-legacy.5581156d.js","./input-legacy.d4357d07.js","./index-legacy.677ea204.js","./use-outside-click-legacy.3e48aa6b.js","./directive-legacy.0554e5f2.js","./XCircleIcon-legacy.2726efd9.js","./index-legacy.021508e8.js","./index-legacy.d5045c51.js","./scroll-legacy.0bcf8f62.js","./focus-trap-legacy.be7f3f75.js","./validator-legacy.0afd2ceb.js"],(function(e){"use strict";var n,c,t,a,i,o,d,f,l;return{setters:[function(e){n=e.u},function(e){c=e.o,t=e.a,a=e.f,i=e.Q,o=e.R,d=e.m},function(e){f=e._},function(e){l=e.E},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){},function(){}],execute:function(){var u={class:"pplax-office-viewer"},r=[function(e){return i("data-v-acdcdb0a"),e=e(),o(),e}((function(){return d("div",{id:"office-body"},null,-1)}))];e("default",f({__name:"OfficeViewer",props:{fileUrl:String,fileName:String},setup:function(e){var i=e,o=n();return c((function(){!function(e,n){var c=document.createElement("script"),t=document.getElementsByTagName("head")[0];c.type="text/javascript",c.charset="UTF-8",c.src=e,c.addEventListener?(c.addEventListener("load",(function(){n()}),!1),c.addEventListener("error",(function(){l.warning("调用在线文档服务失败，请检查在线文档服务是否正常")}),!1)):c.attachEvent&&c.attachEvent("onreadystatechange",(function(){"loaded"===window.event.srcElement.readyState&&n()}));t.appendChild(c)}("".concat(o.globalConfig.onlyOfficeUrl,"/web-apps/apps/api/documents/api.js"),(function(){var e=i.fileName.lastIndexOf("."),n={document:{fileType:i.fileName.substr(e+1),title:i.fileName,url:i.fileUrl,lang:"zh-CN"},width:"100%",editorConfig:{mode:"view",lang:"zh-CN"}};new DocsAPI.DocEditor("office-body",n)}))})),function(e,n){return t(),a("div",u,r)}}},[["__scopeId","data-v-acdcdb0a"]]))}}}))}();
