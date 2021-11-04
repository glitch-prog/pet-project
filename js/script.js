const body = document.getElementsByTagName('BODY');
const btn = document.getElementById('btn');
const input = document.getElementById('input');
const inputCase = document.querySelector('.input__case');
const commentBlock = document.querySelector('.comment__block');
let comment = '';

inputCase.addEventListener('click', (event) => {
  if (event.target == btn) {
    let commentArea = document.createElement('div');
    commentArea.classList.add('comment');

    let p = document.createElement('p');
    p.textContent = input.value;
    commentArea.append(p);
    commentBlock.append(commentArea);
  }
});
