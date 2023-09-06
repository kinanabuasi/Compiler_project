parser grammar parserproject;
options{ tokenVocab=lexerproject;}
@header{
package antlr;
}

prog: (libraryDefinition)* (classDefinition)+ EOF;

libraryDefinition: IMPORT COTATION (uri|className) COTATION COMA;

classDefinition: normalclassDefinition
                | futerrclassDefinition;

normalclassDefinition: ABSTRACT? CLASS ID (EXTENDES ID)? OQCLASS (line)* CQCLASS;

futerrclassDefinition: statefulWidget | statelessWidget;

statefulWidget:ABSTRACT? CLASS ID EXTENDES StatefulWidget OQCLASS
               Const ID OQFUNC OQCLASS Key QUESTION_MARK Key CQCLASS CQFUNC TOWPOIT Super OQFUNC Key TOWPOIT Key CQFUNC COMA

               AT Override
              State QoOrSmal ID QcOrBig CreateState OQFUNC CQFUNC AROW ADER_SCORE ID  OQFUNC CQFUNC COMA
            (line)*
            CQCLASS
              CLASS ADER_SCORE ID EXTENDES State QoOrSmal ID QcOrBig  OQCLASS buildScreen  CQCLASS ;

statelessWidget:ABSTRACT? CLASS ID EXTENDES StatelessWidget OQCLASS
              Const ID OQFUNC OQCLASS Key QUESTION_MARK Key CQCLASS CQFUNC TOWPOIT Super OQFUNC Key TOWPOIT Key CQFUNC COMA
              buildScreen CQCLASS ;

buildScreen: AT Override   Widget Build OQFUNC BUILD CONTEXTE CQFUNC OQCLASS flutterline CQCLASS ;

flutterline: RETURN Scaffold OQFUNC appBar body CQFUNC COMA ;

appBar: AppBar TOWPOIT AppBar1 OQFUNC (title)? CQFUNC COMA1 ;



body: BODY TOWPOIT (rows | columns|container) ;

columns: COLUMN OQFUNC children CQFUNC COMA1 ;
rows: ROW OQFUNC children CQFUNC COMA1 ;

children: Children TOWPOIT OPEN_ARCH_LIST (widgets  (COMA1 widgets)*)* CLOSE_ARCH_LIST COMA1 ;

list_view: List_View DOTE Builder OQFUNC itemCount itemBuilder CQFUNC COMA1 ;
itemCount: ITEM TOWPOIT ID DOTE Length COMA1 | NUMBER;
itemBuilder:ITEMBUILDER1 TOWPOIT OQFUNC OQFUNC BUILD CONTEXTE COMA1 INT_TYPE Index CQFUNC
            OQCLASS RETURN gestureDetector CQCLASS CQFUNC COMA1 ;

gestureDetector: GestureDetector OQFUNC onTap child CQFUNC COMA1 ;

widgets:     rows
            | columns
            | list_view
            |container
            |title
            |color
            |padding_bigP
            |text_Failed
            |elevatedButton
            |image
            |sizedBox
            |expanded
            |center
            ;

//container: Container OQFUNC width hieght  (padding)?  (container_decoration)? child  CQFUNC (COMA|COMA1);
container: Container OQFUNC (containerBody)+ child CQFUNC (COMA|COMA1);
containerBody:width
             |hieght
             |padding
             |container_decoration
             ;
expanded:Expanded OQFUNC   child   CQFUNC COMA1;
child:CHILD TOWPOIT widgets;
sizedBox:  SizedBox OQFUNC  (width| hieght)  CQFUNC COMA1 ;
width:Width TOWPOIT NUMBER COMA1;
hieght:Hieght TOWPOIT NUMBER COMA1;
onTap: ONTAP TOWPOIT OQFUNC CQFUNC OQCLASS (setState)? CQCLASS COMA1;
setState : SetState OQFUNC  OQFUNC CQFUNC OQCLASS widgets CQCLASS CQFUNC COMA ;
color:Color TOWPOIT Colors DOTE ID COMA1;
padding:  Padding TOWPOIT (Const)? EdgeInsets DOTE (All|Only) OQFUNC (TOP TOWPOIT)? value1 CQFUNC COMA1
         ;
title: (Title TOWPOIT)? TEXT OQFUNC STRING CQFUNC COMA1
     | (Title TOWPOIT)? TEXT OQFUNC  StringTitelWithDolar  CQFUNC COMA1
     ;
padding_bigP:Padding_BigP OQFUNC Padding TOWPOIT (Const)? EdgeInsets DOTE (All|Only) OQFUNC (TOP TOWPOIT)? value1 CQFUNC COMA1
                      child  CQFUNC (COMA1| COMA) ;
center:Center OQFUNC child CQFUNC COMA1 ;
text_Failed: (TextField OQFUNC)?  (obscureText)? decoration CQFUNC (COMA1| COMA) ;

elevatedButton: ElevatedButton OQFUNC OnPressed TOWPOIT OQFUNC CQFUNC OQCLASS CQCLASS COMA1 CHILD TOWPOIT title CQFUNC COMA1;

obscureText: ObscureText TOWPOIT (TRUE| FALSE) COMA1;

decoration: Decoration TOWPOIT InputDecoration OQFUNC border labeltext hinttext CQFUNC COMA1;

container_decoration: (Decoration TOWPOIT)? Boxdecoration OQFUNC color borderRadius CQFUNC COMA1 ;
borderRadius: BorderRadius TOWPOIT BorderRadius1 DOTE Circular OQFUNC value1 CQFUNC COMA1;

border: Border TOWPOIT OutlineInputBorder OQFUNC CQFUNC COMA1;
labeltext: LabelText TOWPOIT STRING COMA1;
hinttext: HintText TOWPOIT STRING COMA1  ;

image: Image DOTE ASSET OQFUNC stringImage CQFUNC COMA1
     | Image DOTE ASSET OQFUNC stringImage CQFUNC COMA1
     ;
stringImage:ASSET SlashOrDivision LIB SlashOrDivision IMAGES SlashOrDivision ID DOTE PNG
           |StringTitelWithDolar;

line: variabelDefinition  //variable and list definition
    //| listDefinition    //ماالو داعي لان ماعم ياخد هي القاعدة وقت نعرف الليست
    | mapDefinition
    | functionDefinition
    | ifDefinition
    | exp
    | forDefinition
    | print
    ;

uri: (Package TOWPOIT)?  (folderName SlashOrDivision)+  className
   | DOTSLASH className                    // file path in the same folder
   | TOWDOTSLASH className                   // file path in outer main folder
   ;
className: ID DOTEDART;
folderName:ID;

variabelDefinition: leteOrFinal;
//listDefinition:leteOrFinal;

functionDefinition: voidFunction
                  |typeFunction ;

voidFunction:VOID ID OQFUNC (parameters ( COMA1 parameters)*)* CQFUNC OQCLASS (line)* CQCLASS ;

typeFunction: INT_TYPE ID OQFUNC (parameters ( COMA1 parameters)*)? CQFUNC OQCLASS (line)* RETURN value1 COMA CQCLASS
            | STRING_TYPE ID OQFUNC (parameters ( COMA1 parameters)*)? CQFUNC OQCLASS (line)* RETURN value2 COMA CQCLASS
            | BOOL_TYPE ID OQFUNC (parameters ( COMA1 parameters)*)? CQFUNC OQCLASS (line)* RETURN value4 COMA CQCLASS
            | Double_TYPE ID OQFUNC (parameters ( COMA1 parameters)*)? CQFUNC OQCLASS (line)* RETURN value3 COMA CQCLASS ;

ifDefinition: IF OQFUNC condition CQFUNC   OQCLASS (line)*  CQCLASS;

forDefinition: for
            // | forEach
             ;

for: FOR OQFUNC (variabelForType)? COMA (condition)? COMA (ID (BLUSBLUS| MINUSMINUS))? CQFUNC OQCLASS (line)* CQCLASS;

//condition_Def:condition;
qcOrBig:exp QcOrBig exp;
qoOrSmal:exp QoOrSmal exp;
smalOrEQUAL:exp SmalOrEQUAL exp;
bigOrEQUAL:exp BigOrEQUAL exp;
equalEqual:exp EqualEqual exp;
notEqual:exp NotEqual exp;
variablecondition:trueBoolVar;
condition: qcOrBig
         | qoOrSmal
         | smalOrEQUAL
         | bigOrEQUAL
         | equalEqual
         | notEqual
         | variablecondition
         ;

exp: exp MULT exp  #MULT
   | exp SUM exp   #SUM
   | exp MINUS exp  #MINUS
   | exp SlashOrDivision exp  #SlashOrDivision
   |ID                          #Variable
   |NUMBER                    #Number
   ;

trueBoolVar:ID; //بشرط يكون اس متغير بولياني وقيمتو ترو



mapDefinition: MAP QoOrSmal publicTyeps COMA1 publicTyeps QcOrBig ID EQUAL
               OQCLASS (valueKey TOWPOIT valueValue (COMA1 valueKey TOWPOIT valueValue)*)* CQCLASS COMA
               | MAP QoOrSmal publicTyeps COMA1 publicTyeps QcOrBig ID COMA
               ;

parameters: publicTyeps ID;

//typeParameters: publicTyeps;  هي كمان ما الا داعي حطيت فورا عند البارانيتر ال public type

publicTyeps:Double_TYPE|BOOL_TYPE|INT_TYPE|STRING_TYPE ;

print: PRINT OQFUNC (value (COMA1 value)*)* CQFUNC COMA ;

leteOrFinal:
          LATE? (varOrType|listType)
          |FINAL? (lineWithType| listType)
          |(LATE FINAL)? (lineWithType|listType)
         // |lineWithType
          //|listType
          ;

varOrType:
         VAR ID (EQUAL value)? COMA
        |lineWithType ;               //كان هون type بس اذا حطيتو بصير فيني عرف اي متحول بلا نمط وهالشي مو صح فخلص جبرتو بالنمط

//type:    INT_TYPE? ID (EQUAL value1)? COMA
//        | STRING_TYPE? ID (EQUAL value2)? COMA
//        | Double_TYPE? ID (EQUAL value3)? COMA
//        | BOOL_TYPE? ID (EQUAL value4)? COMA
//        ;

lineWithType:  INT_TYPE ID (EQUAL value1)? COMA
             | STRING_TYPE ID (EQUAL value2)? COMA
             | Double_TYPE ID (EQUAL value3)? COMA
             | BOOL_TYPE ID (EQUAL value4)? COMA
             ;
variabelForType:  INT_TYPE ID EQUAL value1 COMA
             | STRING_TYPE ID EQUAL value2 COMA
             | Double_TYPE ID EQUAL value3 COMA
             | BOOL_TYPE ID EQUAL value4 COMA
             |INT_TYPE ID EQUAL value1
                           | STRING_TYPE ID EQUAL value2
                           | Double_TYPE ID EQUAL value3
                           | BOOL_TYPE ID EQUAL value4
             ;


listType: LIST QoOrSmal INT_TYPE QcOrBig ID (EQUAL OPEN_ARCH_LIST (value1(COMA1 value1)*)* CLOSE_ARCH_LIST)? COMA
        | LIST QoOrSmal STRING_TYPE QcOrBig ID (EQUAL OPEN_ARCH_LIST (value2(COMA1 value2)*)* CLOSE_ARCH_LIST)? COMA
        | LIST QoOrSmal Double_TYPE QcOrBig ID (EQUAL OPEN_ARCH_LIST (value3(COMA1 value3)*)* CLOSE_ARCH_LIST)? COMA
        | LIST QoOrSmal BOOL_TYPE QcOrBig ID (EQUAL OPEN_ARCH_LIST (value4(COMA1 value4)*)* CLOSE_ARCH_LIST)? COMA
        ;

value
   : STRING
   | NUMBER
   |DoubleNUMBER
   | TRUE
   | FALSE
   | NULL
   ;
   valueKey
      : STRING
      | NUMBER
      |DoubleNUMBER
      | TRUE
      | FALSE
      | NULL
      ;
      valueValue
         : STRING
         | NUMBER
         |DoubleNUMBER
         | TRUE
         | FALSE
         | NULL
         ;
value1:NUMBER;

value2:STRING;

value3:DoubleNUMBER;

value4:TRUE|FALSE;