var score = document.getElementById('scorecount');
var life = document.getElementById('lifeCount');
var food = document.getElementById('food');
var img = document.getElementById('img');
var cnavas = document.getElementById('canvas');
var t = 300;
var l = 500;
var ucl,dcl,rcl,lcl,x,y,count = 0,flagl = true,flagr = true,flagu = true,flagd = true,t1,l1;
var lCount = 3;
let emoji = ['💙','💙','💙'];
var gameOverImg = '<img  style = "position: absolute; top: 150px; left:400px; "src = "download.jpeg" width="600px">';
var audioRight = new Audio('Snake Game_rightMusic.wav');
var audioWrong = new Audio('Snake Game_wrongMusic.wav');
var gameOver = new Audio('game-over-38511.mp3');


for(var i = 0;i<3;i++){
	life.innerHTML += emoji[i];
}



function boundry(){
		l = 500;
		t = 200;		
		lCount--;
		if (lCount<=0) {
			document.write(gameOverImg);
			/*gameOver.muted = true;*/
			gameOver.play();
			clearInterval(lcl);
			clearInterval(rcl);
			clearInterval(ucl);
			clearInterval(dcl);
		}
		else{
			life.innerHTML = ""
			for(var i = 0;i<3;i++){
				emoji[lCount] = '🖤'; 
				life.innerHTML += emoji[i];
			}
			/*audioWrong.muted = true;*/
			audioWrong.play();
			console.log(emoji[lCount],lCount)
		}
			
}

function snakeUp() {
	clearInterval(dcl);
	clearInterval(rcl);
	clearInterval(lcl);
	if (flagu) {
		flagu = false;
		flagd = true;
		flagl = true;
		flagr = true;
	 ucl = setInterval(myUp,10);
	}
}

function myUp(){
	myScore();
	document.getElementById('img').style.transform = "rotate(270deg)";
	document.getElementById('img').style.width = 100 +"px";
	t--;
	if (t<=0) {
		boundry();
	}
	document.getElementById('img').style.top = t +"px";
	console.log(t);
}

function snakeDown(){
	clearInterval(ucl);
	clearInterval(rcl);
	clearInterval(lcl);
	if (flagd) {
		flagd = false;
		flagu = true;
		flagl = true;
		flagr = true;
	dcl = setInterval(myDown,10);
	}
}
function myDown(){
	myScore();
	t++;
	if (t>=520) {
		boundry();
	}
	document.getElementById('img').style.top = t +"px";
	console.log(t);
	document.getElementById('img').style.transform = "rotate(90deg)";
	document.getElementById('img').style.width = 100 +"px";
}
function snakeLeft(){
	clearInterval(ucl);
	clearInterval(dcl);
	clearInterval(rcl);
	if (flagl) {
		flagl = false;
		flagd = true;
		flagu = true;
		flagr = true;
	lcl = setInterval(myLeft,10);
	}
}

function myLeft(){
	myScore();
	l--;
	if (l<=0) {
		boundry();
	}
	document.getElementById('img').style.left = l +"px";
	console.log(l);
	document.getElementById('img').style.transform = "rotate(180deg)"
	document.getElementById('img').style.width = 100 +"px";
	
}
function snakeRight(){
	clearInterval(ucl);
	clearInterval(dcl);
	clearInterval(lcl);
	if (flagr) {
		flagr = false;
		flagd = true;
		flagl = true;
		flagu = true;
	rcl = setInterval(myRight,10);
	}
}
function myRight(){
	myScore();
	l++;
	if (l>=870) {
		boundry();
		console.log(audioWrong);
		// audioWrong.play();
	}
	document.getElementById('img').style.left = l +"px";
	console.log(l);
	document.getElementById('img').style.transform = "rotate(0deg)"
	document.getElementById('img').style.width = 100 +"px";
}
function myFood(){
	x = (Math.random()*800);
	y = (Math.random()*575.99)-3;
	// console.log(y,x,l,t);
	if(count>4){
		if (count%5 == 0) {
			food.style.width = 1.5 + "%";
			food.style.height = 2 + "vh";
		}
		else{
			food.style.width = 0.7 + "%";
			food.style.height = 1 + "vh";
		}
	}
	food.style.top = y + "px";
	food.style.left = x + "px";
	// console.log(y,t,x,l)

}
function myScore() {
	y1 = parseInt(y);
	x1 = parseInt(x);
	if (t <= y1+30 && t>=y1-30 && l<=x1+30  &&  l >= x1-30 ) {
		if(count>4){
			if(count%5 == 0){
				count += 2;
				score.innerHTML = count;
			}
			else{
			count++;
			score.innerHTML = count;	
			}
		}
		else{
			count++;
			score.innerHTML = count;
		}
		console.log(t,y1,l,x1)
		audioRight.play();
		myFood();

	}
}
function keyEvent(event){
	console.log(event);
	if (event.keyCode == 37) {
		snakeLeft();
	}
	else if (event.keyCode == 38) {
		snakeUp();
	}
	else if (event.keyCode == 39) {
		snakeRight();
	}
	else if (event.keyCode == 40) {
		snakeDown();
	}
}


function myLoad(){
	myFood();
	/*mybody = document.getElementById("mybody");*/
	/*mybody.dispatchEvent(new KeyboardEvent('keydown', {'key': 'ArrowRight'}));*/

	/*var ev = new KeyboardEvent('keydown', {
      isTrusted: true,
      altKey: false,
      bubbles: true,
      cancelBubble: false,
      cancelable: true,
      charCode: 0,
      code: "ArrowRight",
      composed: true,
      ctrlKey: false,
      currentTarget: null,
      defaultPrevented: false,
      detail: 0,
      eventPhase: 0,
      isComposing: false,
      key: "ArrowRight",
      keyCode: 39,
      location: 0,
      metaKey: false,
      repeat: false,
      returnValue: true,
      shiftKey: false,
      srcElement: body,
      target: body,
      timeStamp: 6082.199999928474,
      type: "keydown",
      which: 39
  });

    mybody.dispatchEvent(ev);*/
	/*snakeRight();*/

	myrightbtn = document.getElementById("right"); 

	myrightbtn.click();
}


