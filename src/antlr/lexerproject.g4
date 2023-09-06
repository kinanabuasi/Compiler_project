lexer grammar lexerproject;

@header{
package antlr;
}
//WORDS

IMPORT: 'import' ;
Package:'package';
VAR:'var'; LIST:'List';
BOOL_TYPE:'bool ';
 Double_TYPE:'double ';
INT_TYPE:'int';
STRING_TYPE:'String';
FINAL:'final ';
LATE:'late';
VOID:'void';
DOTEDART:'.dart';
TRUE:'true';
FALSE:'false';
IF:'if';
NULL:'null';
ABSTRACT:'abstract';
CLASS :'class';
RETURN:'return';
PRINT:'print';
MAP:'map';
FOR:'for';
EXTENDES:'extends';
StatefulWidget:'StatefulWidget';
StatelessWidget:'StatelessWidget';
Const:'const';
Key:'key';
Super:'super';
Override:'override';
State:'State';
Build:'build';
CreateState:'createState';
Widget:'Widget';
BUILD:'BuildContext';
ITEM:'itemCount';
ITEMBUILDER1:'itemBuilder';
Scaffold:'Scaffold';
AppBar:'appBar';
AppBar1:'AppBar';
Title:'title';
TEXT:'Text';
BODY:'body';
Width:'width';
Hieght:'height';
Only:'only';
TOP:'top';
Center:'Center';
ROW:'Row';
Children:'children';
Container:'Container';
List_View:'ListView';
Builder:'builder';
GestureDetector:'GestureDetector';
COLUMN:'Column';
Length:'length';
Index:'index';
ONTAP:'onTap';
SetState:'setState';
Color:'color';
Colors:'Colors';
GRAY:'gray';
Padding:'padding';
Padding_BigP:'Padding';
EdgeInsets:'EdgeInsets';
All:'all';
ObscureText:'obscureText';
TextField:'TextField';
Decoration:'decoration';
InputDecoration:'InputDecoration';
Border:'border';
OutlineInputBorder:'OutlineInputBorder';
LabelText:'labelText';
HintText:'hintText';
Boxdecoration:'BoxDecoration';
BorderRadius:'borderRadius';
BorderRadius1:'BorderRadius';
Circular:'circular';
ElevatedButton:'ElevatedButton';
OnPressed:'onPressed';
CHILD:'child';
Image:'Image';
ASSET:'asset';
LIB:'lib';
IMAGES:'images';
PNG:'png';
SizedBox:'SizedBox';
Expanded:'Expanded';

CONTEXTE :'context';
NavigatTo:'navigatTo';
/////////////////////

COTATION: '"';
COMA: ';' ;
QoOrSmal:'<'; //Q O->OPEN
QcOrBig:'>'; //Q C-> CLOSE
SmalOrEQUAL:'<=';
BigOrEQUAL:'>=';
SlashOrDivision:'/';
DOTSLASH:'./';
TOWDOTSLASH:'../';
COMA1:',';
DOTE:'.';
MULT:'*';
SUM:'+';
MINUS:'-';
EQUAL:'=';
EqualEqual:'==';
NotEqual:'!=';
DOUBLE_ZERO:'0.0';
OPEN_ARCH_LIST:'[';
CLOSE_ARCH_LIST:']';
OQCLASS:'{';
CQCLASS:'}';
OQFUNC:'(';
CQFUNC:')';
BLUSBLUS:'++';
MINUSMINUS:'--';
TOWPOIT:':';
QUESTION_MARK:'?';
AT:'@';
AROW:'=>';
ADER_SCORE:'_';
Dolar:'$';


//Regular

STRING: '"' [a-zA-Z0-9][a-zA-Z0-9]*'"';
StringTitelWithDolar:'"${'ID'['ID']}"';
Target:('['|']'|'{'|'}');
NUMBER:'-'? INT;
DoubleNUMBER: '-'? INT ('.' [0-9] +)? ;
ID: [a-zA-Z0-9][a-zA-Z0-9]*; //identifiers


fragment INT
   : '0' | [1-9][0-9]*
   ;

fragment EXP
   : [Ee] [+\-]? INT
   ;




WS
   : [ \t\n\r] + -> skip
   ;