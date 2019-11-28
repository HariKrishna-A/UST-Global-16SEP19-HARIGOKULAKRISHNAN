alert("Working..");
console.log("FATARROWFUNCTION..:");
var even =num=> {
    for (var i = 0; i < num; i = i + 2) {
        console.log(i);
    }
    return num;
}
var value1 = even(10);
console.log(value1);

console.log("FOR USING ANONYMOUS...:")
var even1 = function (num1) {
    for (var j = 0; j < num1; j = j + 2) {
        console.log(j);
    }
    return num1;
}

var value = even1(10);
console.log(value);
console.log("IT'S FOR NAMED FUNCTION..:");
function sum(no1,no2)
{
    return 0;
}

function sum(no1,no2){
    return 1;
}
var s = sum(10,20);
console.log(s);
console.log("FOR USING SELF INVOKED FUNCION..:");
(function(no)
{
    console.log(no+no);
})
(10);
