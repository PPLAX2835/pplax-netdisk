System.register(["./index-legacy.492b6ebd.js"],(function(e){"use strict";var i;return{setters:[function(e){i=e.ag}],execute:function(){var o={image:["gif","jpg","jpeg","png","bmp","webp","ico"],video:["mp4","webm","m3u8","rmvb","avi","swf","3gp","mkv","flv"],audio:["mp3","wav","wma","ogg","aac","flac","m4a"],text:["scss","sass","kt","gitignore","bat","properties","yml","css","js","md","xml","txt","py","go","html","less","php","rb","rust","script","java","sh","sql"],executable:["exe","dll","com","vbs"],archive:["7z","zip","rar","tar","gz"],pdf:["pdf"],office:["doc","docx","csv","xls","xlsx","ppt","pptx"],three3d:["dae","fbx","gltf","glb","obj","ply","stl"],document:["txt","pages","epub","numbers","keynote"]},n=[];["icon-401","icon-403","icon-404","icon-add-file","icon-add-folder-back","icon-add-folder","icon-add","icon-admin-login","icon-aliyun","icon-baidu","icon-cancel","icon-card-layout","icon-check","icon-clean","icon-copy","icon-copy2","icon-delete","icon-doge-cloud","icon-download-mult","icon-download-package","icon-download","icon-edit","icon-empty","icon-error","icon-file-type-apk","icon-file-type-archive","icon-file-type-audio","icon-file-type-back","icon-file-type-css","icon-file-type-deb","icon-file-type-dll","icon-file-type-doc","icon-file-type-document","icon-file-type-docx","icon-file-type-exe","icon-file-type-expression","icon-file-type-file","icon-file-type-folder","icon-file-type-html","icon-file-type-image","icon-file-type-java","icon-file-type-js","icon-file-type-less","icon-file-type-md","icon-file-type-office","icon-file-type-pdf","icon-file-type-php","icon-file-type-ppt","icon-file-type-pptx","icon-file-type-py","icon-file-type-rb","icon-file-type-root","icon-file-type-rpm","icon-file-type-rust","icon-file-type-script","icon-file-type-text","icon-file-type-three3d","icon-file-type-vbs","icon-file-type-video","icon-file-type-xls","icon-file-type-xlsx","icon-file-type-xml","icon-file-type-yaml","icon-file-upload","icon-files","icon-ftp","icon-google-drive","icon-huawei","icon-image","icon-img-disable","icon-img-enable","icon-info","icon-install-step","icon-link","icon-local","icon-login","icon-minio","icon-move","icon-new-folder","icon-next","icon-onedrive-china","icon-onedrive","icon-prev","icon-preview","icon-qiniu","icon-refresh","icon-reset-password","icon-s3","icon-search","icon-select-all","icon-server","icon-settings","icon-sftp","icon-sharepoint-china","icon-sharepoint","icon-success","icon-table-layout","icon-target","icon-tencent","icon-tool-close","icon-tool-close2","icon-tool-delete","icon-tool-download-mult","icon-tool-download-package","icon-tool-download","icon-tool-edit","icon-tool-link","icon-tool-move","icon-tool-preview","icon-tool-setting","icon-ufile","icon-upload-1","icon-upload-folder","icon-upload","icon-upyun","icon-warning","icon-webdav","icon-pplax-basic","icon-pplax-horizontal","icon-pplax"].forEach((function(e){n.push(e.replace(/^icon-file-type-/,""))}));var t=e("c",{responseCode:{SUCCESS:0,FAIL:-1,REQUIRED_PASSWORD:405,INVALID_PASSWORD:406},storageType:{s3Type:["s3","tencent","aliyun","qiniu","minio","huawei","doge-cloud"],proxyType:["local","webdav","ftp","sftp","google-drive"],micrsoftType:["sharepoint","sharepoint-china","onedrive","onedrive-china"]},version:i.version,constant:{fileTypeMap:o,iconFileType:n,previewFileType:["image","video","audio","text","office","pdf","three3d"]},openPage:function(e){window.open(e)},fileSizeFormat:function(e){if(0===e)return"-";if(-1===e)return"未知";var i=Math.floor(Math.log(e)/Math.log(1024));return(e/Math.pow(1024,i)).toFixed(2)+" "+["B","KB","MB","GB","TB","PB","EB","ZB","YB"][i]},fileSizeFilter:function(e,i,o){return"BACK"===e.type?"":"FOLDER"!==e.type||e.size?0===o?"0 B":-1===o?"未知":t.fileSizeFormat(o):"-"},getFileIconName:function(e){if("BACK"===e.type||"FOLDER"===e.type||"ROOT"===e.type)return e.type.toLowerCase();var i=this.getFileSuffix(e.name),o=this.getFileType(e.name);return-1!==n.indexOf(i)?i:o||"file"},getFileSuffix:function(e){var i=e.lastIndexOf(".");return-1===i?"other":e.substring(i+1).toLowerCase()},getFileName:function(e){var i=e.lastIndexOf(".");return-1===i?"":e.substring(0,i)},getFileType:function(e){var i;for(var n in o){var t=this.getFileSuffix(e);if(-1!==o[n].indexOf(t)){i=n;break}}return i},removeDuplicateSeparator:function(e){var i="";0===e.indexOf("http://")?i="http://":0===e.indexOf("https://")&&(i="https://");for(var o=i.length;o<e.length-1;o++){var n=e.charAt(o),t=e.charAt(o+1);"/"===n&&"/"===t||(i+=n)}return i+=e.charAt(e.length-1)},isMobile:function(){return navigator.userAgent.match(/(phone|pad|pod|iPhone|iPod|ios|iPad|Android|Mobile|BlackBerry|IEMobile|MQQBrowser|JUC|Fennec|wOSBrowser|BrowserNG|WebOS|Symbian|Windows Phone)/i)||window.innerWidth<768},dateFormat:function(e){if(!e)return e;var i=new Date(e);return i.getFullYear()+"-"+(i.getMonth()+1<10?"0"+(i.getMonth()+1):i.getMonth()+1)+"-"+(i.getDate()<10?"0"+i.getDate():i.getDate())+" "+(i.getHours()<10?"0"+i.getHours():i.getHours())+":"+(i.getMinutes()<10?"0"+i.getMinutes():i.getMinutes())+":"+(i.getSeconds()<10?"0"+i.getSeconds():i.getSeconds())}})}}}));
