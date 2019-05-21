
// This script looks for index elements and replaces them with the title of the linked element.
// We could probably do this in Plastex as well, but this is quick and dirty and works.
var indexElements = document.getElementsByTagName("plastex.base.latex.index.indexdestination");
var elements = new Array();
for(var i = 0; i < indexElements.length; i++){
    elements[i] = indexElements[i];
}
for(var i = 0; i < elements.length; i++){
   elements[i].parentNode.innerHTML = elements[i].parentNode.title;
}


