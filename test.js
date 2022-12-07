
// for(let i=0;a.length;i++){

// }
var b="";
var a = "500";
let len = a.length;
for(let i=0;i<len;i++){
    if(a.charAt(i) == ','){
        continue;
    }
   b= b.concat(a.charAt(i));
}
console.log(b*2);