/* 

Projeto: farol
Nome: Thiago Gabriel da Silva Oliveira

*/

module headlight (F,P,C,S);

input F,P,C;
output S;

assign S = F & (~P | ~C);

endmodule