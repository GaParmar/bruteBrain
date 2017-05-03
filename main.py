from brain import Brain

operators = set(["+", "-", "*", "/", "%"])
numbers = set(["1", "0"])
specialChars = set(["(", ")", "input1", "input2"])
keywords = set(["if", "else", "return"])

input1s = [1, 2, 3, 4]
input2s = [1, 2, 3, 4]
outputs = [3, 6, 9, 12]

trials = 4

universe = list(numbers | operators | specialChars)

brain = Brain(universe, input1s, input2s, outputs)
toTest = []
brain.incept(toTest, 0)
