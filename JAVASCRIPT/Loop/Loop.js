console.log("IT'S FOR 'FOR' LOOP..");
var brands = ['abc','bca','cab'];
for(var i =0; i< brands.length; i++)
{
    console.log('Brand FOR LOOP : ',brands[i]);
}

console.log("IT'S FOR 'FOR OF ' LOOP ARRAY");
for(var element of brands)
{
    console.log('Brand FOR OF LOOP  : ',element);
}

console.log("IT'S FOR 'FOR IN ' LOOP. FOR ARRAY");

for(var  index in brands)
{
    console.log('Brands FOR IN LOOP : ',brands[index]);
}

console.log("IT'S FOR 'FOR IN ' LOOP. FOR OBJECT");

var person = {
    Name : 'ABC',
    Age : 33,
    Color : 'WHITE',
}

for(var key in person)
{
    console.log("VALUE : ",person[key]);
}

console.log("IT'S FOR 'forEach ' LOOP. FOR ARRAY");

brands.forEach(function(value,index)
{
    console.log('BRANDS = ',index);
    console.log('BRANDS = ',value);
})

console.log("IT'S FOR 'forEach ' LOOP. FOR ARRAY WITH OBJECT");

var items = [
           {
               Item : 'abc',
               Id   : 01,
               Price: 123,
           },
           {
               Item : 'bca',
               Id   : 02,
               Price: 1234,
           },
           {
               Item : 'cab',
               Id   : 03,
               Price: 12345,
           },
           {
               Item : 'xyz',
               Id   : 04,
               Price: 123456,
           }    
];

console.log('INDEX AND VALUES ARE :');
items.forEach(function(values,index)
{
    console.log(index,values);
}
)