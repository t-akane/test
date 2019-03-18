document.write("問1<br>");
function menseki(hankei,pai=3.14)
{return(hankei*hankei*pai);}

document.write(menseki(5)+"<br>");
document.write(menseki(7)+"<br>");
document.write(menseki(10)+"<br>");

document.write("<br>");


document.write("問2<br>");

function ryoukin(otona,kodomo)
{return((500*otona)+(200*kodomo)+"円です。");}

document.write(ryoukin(2,4)+"<br>");
document.write(ryoukin(1,5)+"<br>");
document.write(ryoukin(3,7)+"<br>");
