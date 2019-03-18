document.write("私の名前は田中です。<br>東京都に住んでいます。<br>");
document.write("年齢は25歳です。<br>");
//alert("このページを離れようとしています。")
//confirm("ログアウトしますか？")
//変数
var a ="1";
document.write(a);
var month=12;
document.write(month+"月");
document.write("<br>");
var g = 5*5;
var h = "5*5";
document.write(h+"="+g);
var a9=1;
document.write("<br>");
document.write(a9++);
document.write("<br>");
document.write(a9++);
document.write("<br>");
document.write(a9);
document.write("<br>");

switch(a){
case  0:
document.write("aは0");
break;
case  1:
document.write("aは1");
break;
default:
document.write("いずれにも該当しない");}
document.write("<br>");
var test1=80;
var test2=96;

if(test1>=80){document.write("1-合格");}
document.write("<br>");
if(test1>=80)
 {if(test2>=80){document.write("1.2合格");}
 else if(test2>=90){document.write("2-合格");}
 else{document.write("1.2不合格");}}
document.write("<br>");
for(var month=1; month<=12; month++)
{document.write(month);
document.write("月");}
document.write("<br>");

for(var b=1; b<=9; b++)
{for(var c=1; c<=9; c++)
 {document.write(b*c);}
 document.write("→"+b+"の段<br>");}
document.write("<br>");
var abc=1;
while(abc<=10)
 {if(abc % 2 ==0)
  {document.write(abc+"<br>");}
 abc++;}

var myoji=["田中","高橋","斉藤"];
document.write(myoji);//全部でる
delete myoji[0];//消える
myoji[0]="新田中";//リライト
document.write("<br>");
document.write(myoji);
document.write("<br>");

function hello(name)
 {return name+"さん。こんにちわ";}
　document.write(hello("高橋"));
　document.write("<br>");
　document.write(hello("鈴木"));
　document.write("<br>");

