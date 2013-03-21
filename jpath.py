# -*- coding: utf-8 -*-

#XPATH PARA XML - http://www.w3schools.com/xpath/xpath_syntax.asp

import re
import json

#data_example = '{id:1, name:"Giulliano", age:30, parentes: [{id:2, name:"Joyce", age:28}]}'
#data_example = '{"id":592157,"nome":"Giulliano","sobreNome":null,"dataAniversario":"11/11/1983","cpf":"31089280823","rg":"","nomeMae":"","email":"giullianomorroni@gmail.com","sexo":"Masculino","telefone":"11 99999999","foto":{"url":"http://image.elephant2.com/site/35/user/avatar/Z2l1bGxpYW5vbW9ycm9uaUBnbWFpbC5jb20=?","idCliente":null},"fotosCliente":[],"fotosAmigos":[],"fotosDiversas":[],"desbravarias":["Roma Calçados - Retiro","Natixis Brasil S/A Banco Múltiplo","Minas Gerais Paes","Garoa Paulista"],"autoridades":["Roma Calçados - Retiro","Natixis Brasil S/A Banco Múltiplo","Minas Gerais Paes","Garoa Paulista"],"totalFlags":0,"totalNotificacoes":30,"totalNotificacoesNovas":0,"amigo":null,"token":"1301868528715725","amizadeSolicitada":null}'
#data_example = "{'id':1, 'name':'Giulliano', 'age':30, 'parentes': [{'id':2, 'name':'Joyce', 'age':28}]}"
#data_example = "{'id':1, 'name':'Giulliano', 'age':30, 'parentes': [{'id':2, 'name':'Joyce', 'age':28, 'parentes': [{'id':3, 'name':'Soraya', 'age':50}]}]}"

data_example = ""
data_example += "[{'id':1, 'name':'Giulliano', 'age':30, 'parentes': [{'id':2, 'name':'Joyce', 'age':28}]}," 
data_example += "{'id':1, 'name':'Giulliano', 'age':30, 'parentes': [{'id':2, 'name':'Joyce', 'age':28}]},"
data_example += "{'id':1, 'name':'Giulliano', 'age':30, 'parentes': [{'id':2, 'name':'Joyce', 'age':28}]}]"

#data_example = data_example.replace('"', '') #remove aspas duplas
#data_example = data_example.replace(' ', '') #remove espaçoes em branco

print data_example

def all_keys():
  rgx_ids = re.compile('\w+:')
  _ids = rgx_ids.findall(data_example)
  for i in _ids:
    print i.replace(':','')
  return _ids  

def all_values():
  rgx_values = re.compile(':\w+')
  _values = rgx_values.findall(data_example)
  result = []
  for i in _values:
    aux = i.replace(':','')
    result.append(aux)
  return result

def all_values_for_key(key):
  rgx_id_value = re.compile(key + ':\w+')
  rgx_values = re.compile(':.*')

  _id_values = rgx_id_value.findall(data_example)
  result = []
  for i in _id_values:
    v = rgx_values.findall(i)
    if len(v) > 0:
      aux = v[0].replace(':','')
      result.append(aux)
  return result

'''
Busca os valores de acordo com o caminho de chaves
indicado, por exemplo: cliente$nome$
'''
def query_by_keys(keys, data=None):
  if data == None:
    data = data_example
  if str(data)[0] == '[':
    return query_list_by_keys(keys, data)
  try:
    keys = keys.split('$')
    json_data = eval(str(data))
    _value = json_data
    while(len(keys)):
      _value = _value[keys.pop(0)]
      if isinstance(_value, list):
  _value = _value[0]
    return _value
  except (TypeError, KeyError,NameError) as e:
    print e
    return []

  
def query_list_by_keys(keys, data=None):
  if data == None:
    data = data_example
  json_data = eval(data)
  _values = []
  _keys = keys
  for j in json_data:
    _aux = query_by_keys(_keys, j)
    _keys = keys
    if (len(_aux) > 0):
      _values.append(_aux)
  return _values
