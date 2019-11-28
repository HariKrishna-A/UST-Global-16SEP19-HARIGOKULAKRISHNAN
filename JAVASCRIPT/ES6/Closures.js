let fun = num =>{
    function innerFunc(){
        let count;
        count = num + 10;
        return count;
    }
    return innerFunc
}
//fun(5);
// console.log(fun(5));
let i = fun(10);
let c =i();
console.log(c);

console.log('=======================================');

let fun1 = num1 =>{
    function innerFun()
    {
        console.log(num1+10);
        //  num1+10;
    }
     innerFun()
}
fun1(30);