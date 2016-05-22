grammar LITE;
programa
: PR_INICIO
 (sentencia)*
 PR_FIN EOF;

sentencia
: declaracion
|asignacion
| sentencia_si
| sentencia_mientras
| sentencia_imprimir
| OTRO  ;

sentencia_si: PR_SI '(' expresion ')' PR_ENTONCES (sentencia)+ (sentencia_sino)? PR_FIN;

sentencia_mientras: PR_MIENTRAS '(' expresion ')' PR_HACER (sentencia)+ PR_FIN;

sentencia_imprimir: PR_IMPRIMIR '(' (expresion) ')' PR_FIN_SENTENCIA;

sentencia_sino: PR_SINO (sentencia)+;

declaracion : PR_CREA  VARIABLE  PR_DECLARADOR  tipo  PR_FIN_SENTENCIA ;

asignacion: VARIABLE PR_ASIGNADOR expresion PR_FIN_SENTENCIA;

expresion
: expresion PR_OPERADOR_POTENCIA<assoc=right> expresion    #ExpPotencia
| PR_NEGATIVO expresion                                    #NumeroNegativo
| expresion PR_OPERADOR_MULTIPLICACION expresion           #ExpMultiplicacion
| expresion PR_OPERADOR_DIVISION expresion                 #ExpDivision
| expresion PR_OPERADOR_SUMA expresion                     #ExpSuma
| expresion PR_OPERADOR_RESTA expresion                    #ExpResta
| expresion PR_MENOR_IGUAL_QUE expresion                   #ExpMenorIgual
| expresion PR_MAYOR_IGUAL_QUE expresion                   #ExpMayorIgual
| expresion PR_MENOR_QUE expresion                         #ExpMenor
| expresion PR_MAYOR_QUE expresion                         #ExpMayor
| expresion PR_NO_IGUAL_QUE expresion                      #ExpNoIgual
| expresion PR_IGUAL_QUE expresion                         #ExpIgual
| expresion PR_Y expresion                                 #ExpY
| expresion PR_O expresion                                 #ExpO
| expresion_atomica                                        #ExpAtomica
;

expresion_atomica
: PR_PAR_ABIERTO expresion PR_PAR_CERRADO                  #ExpParentesis
| NUMERO                                                   #ANumero
| (VERDADERO | FALSO)                                      #ABooleano
|VARIABLE                                                  #AVariable
|TEXTO                                                     #ATexto
;

tipo
:NUMERO
|PALABRA
|BOOLEANO
;

PR_OPERADOR_POTENCIA : 'elevado';
PR_NEGATIVO : '-';
PR_OPERADOR_MULTIPLICACION: '*';
PR_OPERADOR_DIVISION : '/';
PR_OPERADOR_SUMA : '+' ;
PR_OPERADOR_RESTA : '-';
PR_MENOR_IGUAL_QUE : 'menor_igual';
PR_MAYOR_IGUAL_QUE :  'mayor_igual';
PR_MENOR_QUE : 'menor';
PR_MAYOR_QUE : 'mayor';
PR_NO_IGUAL_QUE : 'diferente';
PR_IGUAL_QUE : 'igual';
PR_Y : 'y'|'Y';
PR_O : 'o'|'O';
PR_PAR_ABIERTO : '(';
PR_PAR_CERRADO : ')';
NUMERO :  [0-9]+ ('.' [0-9]*)? ;
VERDADERO: 'verdadero';
FALSO: 'falso';
VARIABLE: [a-zA-Z_] [a-zA-Z_0-9]*;
TEXTO : '"' (~["\r\n] | '""')* '"';
PALABRA : 'palabra' ;
BOOLEANO :  'booleano';
PR_INICIO : 'inicio';
PR_FIN : 'fin';
PR_CREA : 'crea';
PR_DECLARADOR : 'como';
PR_FIN_SENTENCIA : ';';
PR_ASIGNADOR : 'es';
PR_SI : 'si';
PR_ENTONCES : 'entonces';
PR_MIENTRAS : 'mientras';
PR_HACER : 'hacer';
PR_IMPRIMIR : 'mostrar';
PR_SINO : 'sino';
SPACE : [ \t\r\n] -> skip;
OTRO : .  ;
