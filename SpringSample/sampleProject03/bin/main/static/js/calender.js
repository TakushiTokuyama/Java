var calender = document.getElementById('calender');

var list = [];
var youbi = [];

for(var i = 1; i <= 6 * 16; i++){
	var div = document.createElement('div');
	if(i % 3 === 0){
		div.classList = "contents col-sm-4";
	}else{
		div.classList = "contents col-sm-1";
	}
	list[i-1] = div;
}


var count = 1;
for(var i = 1; i <= 6*16; i += 6){
	list[i-1].innerHTML = count;
	count++;
}


for(var i = 3; i <= 6*15; i += 6){
	list[i].innerHTML = count;
	count++;
}


for(var i = 0; i < 6 * 16; i++){
	calender.appendChild(list[i]);
}

var youbi = { 0:"(日)", 1:"(月)", 2:"(火)", 3:"(水)",4:"(木)",5:"(金)",6:"(土)"};

function getFirstDay(date){
	return new Date(date.getFullYear(), date.getMonth(), 1);
}

console.log(getFirstDay(new Date()).getDate());
console.log(youbi[getFirstDay(new Date()).getDay()]);

function getLastDay(date){
	return new Date(date.getFullYear(), date.getMonth() + 1, 0);
}

console.log(getLastDay(new Date()).getDate());
console.log(youbi[getLastDay(new Date()).getDay()]);