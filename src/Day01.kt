import java.io.File

fun main() {
    fun parseInput(input: String) = input.split("\n\n").map { elf ->
        elf.lines().map { it.toInt() }
    }

    fun fun1(input: String):List<List<Int>> {
        val data = parseInput(input)
        return data
    }

    fun fun2(input: String) : Int {

        val data = parseInput(input)
        val sumList = data.map{it.sum()}
        return sumList.sortedDescending()
            .take(3)
            .sum()
    }


    val testFileInput = readFileInput("Day01_test")
    val fileInput = readFileInput("Day01")

    val testLargeSum = fun1(testFileInput).maxOf { it.sum() }
    val largeSum = fun1(fileInput).maxOf { it.sum() }

    val testTop3Sum = fun2(testFileInput)
    val top3Sum = fun2(fileInput)
    println(top3Sum)

    val output1 = testFileInput.split("\n\n")
//    println(output1)
    val output2 = output1.map { it.split("\n") }
//    println(output2)
//    print(largeSum)
//    check(largeSum == 24000)



}
