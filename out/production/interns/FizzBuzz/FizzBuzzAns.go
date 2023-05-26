package main

import "fmt"

type fizzBuzzNum struct {
	n int
}

func fizzBuzz(stringSequence *fizzBuzzNum) {
	for i := 0; i <= stringSequence.n; i++ {
		if i%3 == 0 && i%5 == 0 {
			fmt.Println("FizzBuzz")
		} else if i%3 == 0 {
			fmt.Println("Fizz")
		} else if i%5 == 0 {
			fmt.Println("Buzz")
		} else {
			fmt.Println(i)
		}
	}
}

func main() {

	num := fizzBuzzNum{15}
	fizzBuzz(&num)
}
