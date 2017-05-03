
class Brain:
    inception_level = 0
    universe = []
    input1s = []
    input2s = []
    outputs = []

    def __init__(self, uni, inp1, inp2, out):
        inception_level=0
        self.universe = uni
        self.input1s = inp1
        self.input2s = inp2
        self.outputs = out

    def incept (x, toTest, currLevel):
        #print ("level: "+str(currLevel))

        if (currLevel > 4):
            return
        else:
            for token in x.universe:
                toTest.append(token)
                try:
                    ctr=0
                    for trial in range (4):
                        input1 = x.input1s[trial]
                        input2 = x.input2s[trial]
                        output = x.outputs[trial]
                        #print("checking: "+''.join(toTest))
                        if (eval(''.join(toTest)) == output):
                            ctr = ctr+1
                    if (ctr == 4):
                        print ("".join(toTest))
                except SyntaxError:
                    pass;
                except TypeError:
                    pass;
                except ZeroDivisionError:
                    pass;
                except NameError:
                    pass;
                x.incept(toTest, (currLevel+1))
                try:
                    toTest.remove(token)
                except ValueError:
                    pass;
