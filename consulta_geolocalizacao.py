# -*- coding: utf-8 -*-
'''
Created on 02/09/2012

@author: giulliano
'''

import urllib2
import json

class Geo(object):

  #Links de Exemplos:
  #http://maps.googleapis.com/maps/api/geocode/json?address=Rua+Cairiri,+15+SP&sensor=false
  #http://maps.googleapis.com/maps/api/geocode/json?latlng=-23.5796764,-46.5639514&sensor=false

  '''
  Construtor
  '''
  def __init__(self):
	print 'inicializando API de Geo Localização'

  '''
  Recebe os parametros de consulta e monta a query/url baseado em latitude e longitude
  '''
  def reversa(self, latitude, longitude):
	link = 'http://maps.googleapis.com/maps/api/geocode/json?'
	if (latitude != None and longitude != None):
	  print 'consulta endereco pela lat/long'
	  link += 'latlng=' + str(latitude) + ',' + str(longitude);
	else:
	  print 'Dados para consulta inválidos'
	  return
	link += '&sensor=false'
	return self.geo(link);

  '''
  Recebe os parametros de consulta e monta a query/url baseado em um endereco
  '''
  def consulta(self, logradouro, numero = 0, bairro = '', cidade = ''):
	link = 'http://maps.googleapis.com/maps/api/geocode/json?'
	if (logradouro != None):
	  print 'consulta lat/long pelo endereco'
	  if bairro != '':
		bairro = '-' + bairro.replace(' ', '+')
	  if cidade != '':
		cidade = ',' + cidade.replace(' ', '+')
	  if numero != 0:
		numero = ',' + str(numero)
	  logradouro = logradouro.replace(' ', '+')
	  link += 'address='+ logradouro + str(numero) + bairro + cidade;
	else:
	  print 'Dados para consulta inválidos'
	  return
	link += '&sensor=false'
	return self.geo(link);

  '''
  Realiza a consulta aos serviços do google
  Retorna uma string no seguinte formato
  logradouro#numero#bairro#cidade#latitude#longitude
  '''
  def geo(self, link):
	print link;
	numero = 0
	logradouro = ''
	bairro = ''
	cidade = ''
	pais = ''
	cep = ''
	latitude = 0
	longitude = 0

	try:
	  c = urllib2.urlopen(link);
	  r = c.read()
	  d = json.loads(r);

	  status = d['status']
	  if status == 'ZERO_RESULTS': return 'A consulta teve êxito, mas não retornou resultados. Isso pode ocorrer se o geocódigo não existe em um local remoto.'
	  elif status == 'OVER_QUERY_LIMIT': return 'Sua cota diária excedeu...cuidado para não ser bloqueado'
	  elif status == 'REQUEST_DENIED': return 'Solicitação negada...verifique se todos os parâmetros foram informados, inclusive o sensor'
	  elif status == 'INVALID_REQUEST': return 'Nenhum método de consulta selecionado, escolha a consulta por endereco ou latitude/longitude'

	  latitude = d['results'][0]['geometry']['location']['lat']
	  longitude = d['results'][0]['geometry']['location']['lng']
	  endereco = d['results'][0]['address_components']

	  for e in endereco:
		tipo_registro = e['types']
		valor = e['short_name']
		if tipo_registro[0] == 'street_number':
		  numero = valor
		elif tipo_registro[0] == 'route':
		  logradouro = valor
		elif tipo_registro[0] == 'sublocality':
		  bairro = valor
		elif tipo_registro[0] == 'locality':
		  cidade = valor
		elif tipo_registro[0] == 'country':
		  pais = valor
		elif tipo_registro[0] == 'postal_code':
		  cep = valor
	except Exception:
	  return 'Nao foi possivel obter dados para o endereco'

	return logradouro + '#' + str(numero) + '#' + bairro + '#' + cidade + '#' + str(latitude) + '#' + str(longitude)