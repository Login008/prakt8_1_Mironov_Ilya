class Newspapers {
        var название: String = ""
        var номер: Int = 0
        var дата_выпуска: String = ""
    fun GetInfo(): String {
        var message = "Название: $название\nНомер газеты: $номер\nДата выпуска: $дата_выпуска"
        return message
    }
    fun SetInfo(){
        try {
            print("Введите название газеты: ")
            var name = readLine()!!.toString()
            название = name
            print("Введите номер газеты: ")
            var number = readLine()!!.toInt()
            номер = number
            if (номер > 0) {
                print("Введите дату выпуска газеты: ")
                var date = readLine()!!.toString()
                дата_выпуска = date
            }
            else
            {
                println("Номер газеты не может быть отрицательным, введите данные заново")
                SetInfo()
            }
        }
        catch (e:Exception)
        {
            println("Неверный формат данных, введите данные заново")
            SetInfo()
        }
    }
    fun About() {
        println("Данная газета об олимпийских играх")
    }
    fun AddStage() {
        try {
            println("Введите номер статьи: ")
            var number = readLine()!!.toInt()
            if (number > 0) {
                println("Добавьте статью: ")
                var message = readLine()!!.toString()
                название += "\nСтатья $number о: $message"
            }
            else
            {
                println("Номер статьи не может быть меньше нуля, введите данные заново")
                AddStage()
            }
        }
        catch (e:Exception)
        {
            println("Неверный формат данных, введите данные заново")
            AddStage()
        }
    }
    fun Who() {
        println("Издатель: ГорИнвест")
    }
}