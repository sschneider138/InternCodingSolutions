class FuzzBizz:
    def __init__(self, k):
        self.k = k

    def solutionMethod(self):
        for num in range(self.k+1):
            if num % 3 == 0 and num % 5 == 0:
                print('FizzBuzz')
            elif num % 3 == 0:
                print('Fizz')
            elif num % 5 == 0:
                print('Buzz')
            else:
                print(num)


FuzzBizz(15).solutionMethod()
