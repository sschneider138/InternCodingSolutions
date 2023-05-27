#![allow(non_snake_case)]

struct FizzBuzzStruct {
    n: i32,
}

fn fizzBuzz(instance: &FizzBuzzStruct) {
    for i in 0..=instance.n {
        if i % 3 == 0 && i % 5 == 0 {
            println!("FizzBuzz");
        } else if i % 3 == 0 {
            println!("Fizz");
        } else if i % 5 == 0 {
            println!("Buzz");
        } else {
            println!("{}", i);
        }
    }
}

fn main() {
    let num = FizzBuzzStruct { n: 15 };
    fizzBuzz(&num);
}
