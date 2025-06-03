// 1. Searching for tag names:
const sampleClassElems = document.querySelectorAll('.sample_class_2');
function getTagsOfElements(elements) {
    const tagNamesArray = [];
    elements.forEach(element => {
        tagNamesArray.push(element.tagName);
    });
    return tagNamesArray;
}
console.log(getTagsOfElements(sampleClassElems));

// 2. adding a class:
const sampleIdElem = document.getElementById('sample_id_2');
function getClassesOfElement(element) {
    const classesArray = [];
    element.classList.forEach(className => {
        classesArray.push(className);
    });
    return classesArray;
}
console.log(getClassesOfElement(sampleIdElem));

// 3. text search:
const funnyTextElems = document.querySelectorAll('.funny_text li');
function getInnerTextsOfElements(elements) {
    const textsArray = [];
    elements.forEach(element => {
        textsArray.push(element.innerText);
    });
    return textsArray;
}
console.log(getInnerTextsOfElements(funnyTextElems));

// 4. searching for lin addresses:
const linkElems = document.querySelectorAll('a');
function getAddressesOfElements(elements) {
    const hrefsArray = [];
    elements.forEach(element => {
        if (element.href.includes('www.')) {
            hrefsArray.push(element.href);
        }
    });
    console.log(hrefsArray);
}
getAddressesOfElements(linkElems);

// 5. searching for child tags:
const superFormElems = document.getElementById('super_form');
function getChildrenOfElement(element) {
    const childrenArray = superFormElems.children;
    for (let i = 0; i < childrenArray.length; i++) {
        console.log(childrenArray[i].tagName);
    }
}
getChildrenOfElement(superFormElems);