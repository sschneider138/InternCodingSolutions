class FizzBuzzAns{
    let n: Int

    init(n: Int) {
        self.n = n
    }

    func fizzBuzz() {
        for num in 0...self.n {
            if num%3 == 0 && num%5==0 {
                print("FizzBuzz")
            } else if num%3==0 {
                print("Fizz")
            } else if num%5==0 {
                print("Buzz")
            } else {
                print(num)
            }
        }
    }
}

let a = FizzBuzzAns(n:15)
a.fizzBuzz()
print("\n\nHello there")