#!/usr/bin/python
# -*- coding: utf-8 -*-
import json
import sys

#----------------------------------------------------------------

class MyEncoder(json.JSONEncoder):
	def default(self, o):
		return o.__dict__

#----------------------------------------------------------------

class Conference:
	def __init__(self, value, name, index):
		self.value = value
		self.name  = name
		self.index = index

#----------------------------------------------------------------

class Vertice:
	def __init__(self, id, name, attribute):
		self.id        = id
		self.name      = name
		self.attribute = attribute

#----------------------------------------------------------------

class Edge:
	def __init(self, source, target):
		self.source    = source
		self.target = target

#----------------------------------------------------------------

class Conferences:
	def __init__(self, fileName):
		self.conferences = []
		try:
			file = open(fileName, 'r')
			index = 0
			
			for line in file:
				split = line.strip().split(' ')
				self.conferences.append(Conference(split[0], split[1], index))
				index += 1 # index++ n'existe pas en Python
				file.close()
		
		except IOError, e:
			# Si le fichier ne peut pas être ouvert
			sys.stderr.write("IOError {1} opening conferences file {0}".format(fileName, e.errno, e.strerror) + '\n')
			sys.exit(2)

#----------------------------------------------------------------

class Vertices:
	def __init__(self, fileName, attributes):
		self.list = []
		try:
			file = open(fileName, "r")

			for line in file:
				split = line.strip().split(',')
				self.list.append(Vertice(split[0], split[2], attributes.getValue(split[0])))

		except IOError, e:
			# Si le fichier ne peut pas être ouvert
			sys.stderr.write("IOError {1} opening conferences file {0}".format(fileName, e.errno, e.strerror) + '\n')
			sys.exit(2)

#----------------------------------------------------------------

class Edges:
	def __init__(self, fileName, attributes):
		self.graph = []
		try:
			file = open(fileName, "r")

			for line in file:
				split = line.strip().split(' ')

				# for item in range (1, len(split)):
				for item in split[1:] :
					if split[0] < int(item):
						self.graph.append(Edge(split[0], int(item)))

		except IOError, e:
			# Si le fichier ne peut pas être ouvert
			sys.stderr.write("IOError {1} opening conferences file {0}".format(fileName, e.errno, e.strerror) + '\n')
			sys.exit(2)

	def order(a,b):
		return (a, b) if a < b else (b, a)

#----------------------------------------------------------------

class Attributes:
	def __init__(self, fileName):
		self.attributes = []
		try:
			file = open(fileName, "r")
			
			for line in file:
				split = line.strip().split(' ')
				somme = 0
				
				for at in range (1, len(split)):
					somme += int(split[at]) # on convertit un string en int
				
				self.attributes.append(somme)

			file.close()

		except IOError, e:
			# Si le fichier ne peut pas être ouvert
			sys.stderr.write("IOError {1} opening conferences file {0}".format(fileName, e.errno, e.strerror) + '\n')
			sys.exit(2)

	def getValue(index):
		return attributes[index]

#----------------------------------------------------------------


if len(sys.argv) != 5:
	sys.stderr.write("error usage : " + sys.argv[0] + " <edges> <vertices> <conferences> <attributes>" + "\n")
	sys.stderr.write("transforms a text graph into JSON\n")
	sys.exit(1)

edges = Edges(sys.argv[1])

attributes  = Attributes(sys.argv[4])
vertices    = Vertices(sys.argv[2], attributes)
conferences = Conferences(sys.argv[3])
# graph = ...
# print MyEncoder().encode(graph)