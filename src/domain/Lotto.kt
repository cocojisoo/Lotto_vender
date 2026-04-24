package domain

class Lotto(private val numbers : List<Int>){
    init{
        validateSize(numbers)
        validateRange(numbers)
        validateDuplicate(numbers)
    }
    private fun validateSize(numbers: List<Int>){
        if(numbers.size != 6) throws IllegalArgumentException("[ERROR] 번호는 6개여야합니다!")
    }
    private fun validateRange(numbers: List<Int>){
        if(numbers.all{it !in 1..45}) throws IllegalArgumentException("[ERROR] 번호는 1 ~ 45 사이의 수여야 합니다!")
    }
    private fun validateDuplicate(numbers: List<Int>){
        if(numbers.distinct().size != 6) throws IllegalArgumentException("[ERROR] 번호는 중복되어선 안됩니다!")
    }
}