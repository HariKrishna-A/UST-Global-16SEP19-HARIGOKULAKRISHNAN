var todayDate = new Date();
console.log("TODAYDATE : ", todayDate);
console.log("DAY : ",todayDate.getDay());
console.log("YEAR : ",todayDate.getFullYear());
console.log('MONTH : ',todayDate.getMonth());
console.log("DATE : ",todayDate.getDate());
console.log("USEING CONS WE CAN GET A DATE...:");
 var consMilli = new Date(0);
 console.log('DTAE : ',consMilli);
 var consString = new Date('Aug 29');
 console.log('STRING : ',consString);
 var consYear = new Date(2017,10);
 console.log('YEAR : ',consYear);