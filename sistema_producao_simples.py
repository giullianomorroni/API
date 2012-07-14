from random import *
import sys

#ESTE ALGORITMO TENTA RESOLVER O PROBLEMA DO QUEBRA-CABECA DE 8 PECAS
#NAO EH APLICADO NENHUMA TIPO DE ESCOLHA DE REGRA, ELAS SAO ESCOLHIDAS AO ACASO
#RESPEITANDO AS REGRAS DO JOGO DE QUE SOMENTE O '0' (ZERO/VAZIO) PODE SE MOVER.
#EXECUTEI O ALGORITMO 10 VEZES SEGUIDAS PERMITINDO AO COMPUTADOR 5000 CHANCES, E NAO OBTIVE SUCESSO, 
#O COMPUTADOR NAO FOI CAPAZ DE RESOLVER O PROBLEMA ESCOLHENDO AO ACASO.
class SP:

  global tentativas;
  global tabuleiro;
  global LINHA_ZERO;
  global COLUNA_ZERO;

  def __init__(self):
	print "Iniciando modulo de Inteligencia Artifical - Sistemas de Producao";
	self.tentativas = 0;
	self.tabuleiro = [[8,7,1], [2,6,3], [4,5,0]];
	self.LINHA_ZERO=2;
	self.COLUNA_ZERO=2;
	sys.setrecursionlimit(30000)

  def jogar(self):
	try:
	  self.tentativas = self.tentativas+1;
	  if self.tentativas > 5000:
		print 'O total de tentativas excedeu ' + str(self.tentativas);
		sys.exit();
	  self.alterar();
	  self.analisarJogada();
	except RuntimeError:
	  sys.exit()

  def alterar(self):
	nova_linha = int(uniform(0,3))
	nova_coluna = int(uniform(0,3))

	#Para que ocorra o movimento a nova linha e coluna, devem estar proximas ao valor zero.
	#Quando a linha eh a mesma, a coluna pode se mover para direita ou esquerda
	#Quando a linha eh diferente a coluna deve ser a mesma
	proximidade_linha = (nova_linha - self.LINHA_ZERO)
	proximidade_coluna = (nova_coluna - self.COLUNA_ZERO)
	
	#Regra invalida
	if ((nova_linha != self.LINHA_ZERO) and (nova_coluna != self.COLUNA_ZERO)):
	  self.alterar();
	elif (proximidade_linha == 1 or proximidade_linha == 0 or proximidade_linha == (-1)) and (proximidade_coluna == 1 or proximidade_coluna == 0 or proximidade_coluna == (-1)):
	  #Regra invalida. Mesma linha e mesma coluna.
	  if ((nova_linha == self.LINHA_ZERO) and (nova_coluna == self.COLUNA_ZERO)):
		self.alterar();
	  else:
		valor_zero = self.tabuleiro[self.LINHA_ZERO][self.COLUNA_ZERO];
		valor_troca = self.tabuleiro[nova_linha][nova_coluna];
		self.tabuleiro[self.LINHA_ZERO][self.COLUNA_ZERO] = valor_troca;
		self.tabuleiro[nova_linha][nova_coluna] = valor_zero;
		self.LINHA_ZERO = nova_linha;
		self.COLUNA_ZERO = nova_coluna;
		self.exibir();
		self.tentativas = self.tentativas + 1;
	else:
	  #Regra invalida
	  self.alterar();

  def analisarJogada(self):
	if self.tabuleiro[0][0] == 1 and self.tabuleiro[0][1] == 2 and self.tabuleiro[0][2] == 3:
	  if self.tabuleiro[1][0] == 4 and self.tabuleiro[1][1] == 0 and self.tabuleiro[1][2] == 5:
		if self.tabuleiro[2][0] == 6 and self.tabuleiro[2][1] == 7 and self.tabuleiro[2][2] == 8:
		  print "Parabens, voce conseguiu, total de tentativas necessarias: " + str(self.tentativas);
		  sys.exit();
	self.jogar();

  def exibir(self):
	print '-------------'  
	for valor in self.tabuleiro:
	  print valor;
