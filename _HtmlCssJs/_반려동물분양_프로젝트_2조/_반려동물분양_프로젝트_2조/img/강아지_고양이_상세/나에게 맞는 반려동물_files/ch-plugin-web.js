!function(){var e;if(e=window.navigator.userAgent,!/(Opera\/.+Opera Mobi.+Version\/((10|11)\.0|11\.1|11\.5|12\.(0|1)))|(Opera\/((10|11)\.0|11\.1|11\.5|12\.(0|1)).+Opera Mobi)|(Opera Mobi.+Opera(?:\/|\s+)((10|11)\.0|11\.1|11\.5|12\.(0|1)))|(SamsungBrowser\/((4|5)\.0|5\.4))|(IEMobile[ /](10|11)\.0)|(Android Eclair)|(Android Froyo)|(Android Gingerbread)|(Android Honeycomb)|(PlayBook.+RIM Tablet OS (7\.0|10\.0)\.\d+)|((Black[bB]erry|BB10).+Version\/(7\.0|10\.0)\.\d+)|(Trident\/6\.0)|(Trident\/5\.0)|(Trident\/4\.0)|(([MS]?IE) (5\.5|([6-9]|10)\.0))/.test(e)&&window.navigator.cookieEnabled){if(!document.getElementById("ch-plugin")){var n=document.createElement("div");n.id="ch-plugin",document.body.appendChild(n)}var i=document.getElementById("ch-plugin");i.classList.add("notranslate"),i.innerHTML+='      <div id="ch-plugin-entry"></div>      <div id="ch-plugin-script" style="display:none;">        <iframe id="ch-plugin-script-iframe" title="Channel chat" style="position:relative!important;height:100%!important;width:100%!important;border:none!important;"></iframe>      </div>    ';var t=document.getElementById("ch-plugin-script-iframe"),r=!1,o=function(){var e=t.contentDocument||t.contentWindow.document;e.open(),e.write('<!DOCTYPE html><script async type="text/javascript" src="https://cdn.channel.io/plugin/ch-plugin-core.12772e37.vendor.js" charset="UTF-8"><\/script>'),e.write('<script async type="text/javascript" src="https://cdn.channel.io/plugin/ch-plugin-core-20240321230730.js" charset="UTF-8"><\/script>'),e.write('<html lang="en"><head><meta charset="utf-8"></head><body><div id="main"></div></body></html>'),e.close(),r=!0};t.onload||o(),t.onload=function(){r||o()}}}();