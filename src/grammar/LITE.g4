grammar LITE;
programa: cuerpo;
cuerpo: PR_INICIO (sentencia)* PR_FIN;
sentencia: declaracion | asignacion | sentencia_si | sentencia_mientras | sentencia_imprimir | OTRO ;
declaracion : PR_CREA variable PR_DECLARADOR tipo PR_FIN_SENTENCIA;
asignacion: variable PR_ASIGNADOR expresion PR_FIN_SENTENCIA;
sentencia_si: PR_SI PR_PARENTESIS_A expresion_logica PR_PARENTESIS_C PR_ENTONCES (sentencia)+ (sentencia_sino)? PR_FIN;
sentencia_mientras: PR_MIENTRAS PR_PARENTESIS_A expresion_logica PR_PARENTESIS_C PR_HACER (sentencia)* PR_FIN;
sentencia_imprimir: PR_IMPRIMIR PR_PARENTESIS_A (variable | valor | expresion_logica| expresion_matematica)? PR_PARENTESIS_C PR_FIN_SENTENCIA;
sentencia_sino: PR_SINO (sentencia)+;
expresion : expresion_logica | expresion_matematica ;
expresion_logica: variable OPERADOR_LOGICO variable | valor OPERADOR_LOGICO valor | valor OPERADOR_LOGICO variable | variable OPERADOR_LOGICO valor | PR_PARENTESIS_A expresion OPERADOR_LOGICO expresion PR_PARENTESIS_C | valor | variable | expresion_logico_matematica;
expresion_matematica : variable OPERADOR_MATEMATICO variable | valor OPERADOR_MATEMATICO valor | valor OPERADOR_MATEMATICO variable | variable OPERADOR_MATEMATICO valor | PR_PARENTESIS_A expresion OPERADOR_MATEMATICO expresion PR_PARENTESIS_C | valor | variable;
expresion_logico_matematica: expresion_matematica OPERADOR_LOGICO_MATEMATICO  expresion_matematica;
variable : ( (LETRA)+ (DIGITO | LETRA)*);
valor : valor_numero| texto | VALOR_BOOLEANO;
tipo : NUMERO | PALABRA | BOOLEANO;
valor_numero : (PR_NEGATIVO)? (DIGITO)+ (PR_SEPARADOR_DECIMAL (DIGITO)+ )?;
texto : variable PR_CONCATENAR FRASE | FRASE PR_CONCATENAR variable | FRASE PR_CONCATENAR FRASE | FRASE | variable;

FRASE: '"' (~["\r\n] | '""')* '"';
NUMERO : 'número'| 'numero' ;
PALABRA : 'palabra' ;
BOOLEANO :  'booleano';

LETRA : [a-zA-Z_];
DIGITO: [0-9];
VALOR_BOOLEANO : 'verdadero'| 'falso';

PR_INICIO : 'inicio';
PR_FIN : 'fin';
PR_CREA : 'crea';
PR_DECLARADOR : 'como';
PR_FIN_SENTENCIA : ';';
PR_ASIGNADOR : 'es';
PR_SI : 'si';
PR_PARENTESIS_A : '(';
PR_PARENTESIS_C : ')';
PR_ENTONCES : 'entonces';
PR_MIENTRAS : 'mientras';
PR_HACER : 'hacer';
PR_IMPRIMIR : 'mostrar';
PR_SINO : 'sino';
PR_NEGATIVO : '-';
OTRO: . ;
SPACE : [ \t\r\n] -> skip;

OPERADOR_MATEMATICO : '+'|'-'|'*'|'/';
OPERADOR_LOGICO_MATEMATICO: '>' | '<' | '>=' | '<='| '==';
OPERADOR_LOGICO : 'igual' | 'diferente' | 'y' | 'o' | 'no';
PR_SEPARADOR_DECIMAL: '.';
PR_CONCATENAR: 'con';


