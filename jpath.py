# -*- coding: utf-8 -*-
import re

#json = '{id:1, name:"Giulliano", age:30, parentes: [{id:2, name:"Joyce", age:28}]}'
json = '{"id":592157,"nome":"Giulliano","sobreNome":null,"dataAniversario":"11/11/1983","cpf":"31089280823","rg":"","nomeMae":"","email":"giullianomorroni@gmail.com","sexo":"Masculino","telefone":"11 99999999","foto":{"url":"http://image.elephant2.com/site/35/user/avatar/Z2l1bGxpYW5vbW9ycm9uaUBnbWFpbC5jb20=?","idCliente":null},"fotosCliente":[],"fotosAmigos":[],"fotosDiversas":[],"desbravarias":["Roma Calçados - Retiro","Natixis Brasil S/A Banco Múltiplo","Minas Gerais Paes","Garoa Paulista"],"autoridades":["Roma Calçados - Retiro","Natixis Brasil S/A Banco Múltiplo","Minas Gerais Paes","Garoa Paulista"],"totalFlags":0,"totalNotificacoes":30,"totalNotificacoesNovas":0,"amigo":null,"token":"1301868528715725","amizadeSolicitada":null}'
json = '{id:1, name:"Giulliano", age:30, parentes: [{id:2, name:"Joyce", age:28}]}'

json = json.replace('"', '') #remove aspas duplas
json = json.replace(' ', '') #remove espaçoes em branco
print json

def all_keys():
  rgx_ids = re.compile('\w+:')
  _ids = rgx_ids.findall(json)
  for i in _ids:
    print i.replace(':','')
  return _ids  

def all_values():
  rgx_values = re.compile(':\w+')
  _values = rgx_values.findall(json)
  result = []
  for i in _values:
    aux = i.replace(':','')
    result.append(aux)
  return result

def all_values_for_key(key):
  rgx_id_value = re.compile(key + ':\w+')
  rgx_values = re.compile(':.*')

  _id_values = rgx_id_value.findall(json)
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
def query_by_keys(key):
  keys = key.split('$')
  _values = []
  for k in keys:
    _values.append(json[k])
  print _values  
