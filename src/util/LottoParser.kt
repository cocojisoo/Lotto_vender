package util

object LottoParser{
    fun parseNumbers(input : String) : List<Int>{
        val trimInput = input.trim()
        validateEmpty(trimInput)
        return trimInput.split(",")
            .map{it.trim()}
            .map{covertToInt(it)}
    }
    private fun validateEmpty(input : String){
        if(input.isEmpty){
            throw IllegalArgumentException("[ERROR] 로또 숫자를 입력해주세요!")
        }
    }
    private fun convertToInt(it : String) : Int {
       return it.toIntOrNull()? : throw IllegalArgumentException("[ERROR] ${it}은 숫자가 아닙니다!")
    }
}

