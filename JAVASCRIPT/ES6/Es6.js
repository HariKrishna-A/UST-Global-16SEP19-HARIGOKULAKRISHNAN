 const mge = new Promise((resolve,reject)=>{
    if(30>10)
    {
        resolve('Success');
    }else
    reject('Failed');
})

mge.then( msg => {
    console.log('Success Message : ',msg);
    
}).catch( error =>{
    console.log("Failure Message : ",error);
    
})




console.log('======================FOR OBJECT====================')
const mgeObj = new Promise((resolve,reject)=>{
    let n1= prompt("Enter a 1st Vlaue : ");
    let n2= prompt("Enter a 2st Vlaue : ")
    if(n1>n2)
    {
        resolve([
            {
                name : 'Abc',
                id : 102
            },
            {
                name : 'Bca',
                id : 142
            },
            {
                name : 'Cab',
                id : 144
            },
            {
                name : 'Cba',
                id : 104
            }
        ]);
    }else
    reject([1,2,3,4,5,6]);
})

mgeObj.then( msgObj => {
    console.log('Success Message : ',msgObj);
    
}).catch( errorObj =>{
    console.log("Failure Message : ",errorObj);
    
})





