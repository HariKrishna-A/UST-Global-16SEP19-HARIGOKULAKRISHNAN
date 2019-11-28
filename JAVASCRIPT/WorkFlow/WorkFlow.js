function first(callFunc)
{
    setTimeout(function()
{
    console.log('First Function Executed');
    callFunc();
},0)
console.log("First");
}
function second()
{
    console.log('Second Function Executed');
}

first(second);
//second();