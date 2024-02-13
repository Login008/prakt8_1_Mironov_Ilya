class Exam {
    var имя_студента: String = ""
    var предмет: String = ""
    var дата_экзамена: String = ""
    var оценка: String = ""
    fun GetInfo(): String {
        var message = "Имя студента: $имя_студента\nПредмет: $предмет\nДата экзамена: $дата_экзамена\nОценка: $оценка"
        return message
    }
    fun SetInfo(){
        try {
            print("Введите имя студента: ")
            var name = readLine()!!.toString()
            имя_студента = name
            print("Введите название предмета: ")
            var predmet = readLine()!!.toString()
            предмет = predmet
            print("Введите дату экзамена: ")
            var date = readLine()!!.toString()
            дата_экзамена = date
            print("Введите полученную оценку: ")
            var mark = readLine()!!.toInt()
            оценка += "$mark"
        }
        catch (e:Exception)
        {
            println("Неверный формат данных, введите данные заново")
            SetInfo()
        }
    }
    fun SetTheme(){
        print("Тема экзамена: ")
        var theme = readLine()!!.toString()
        предмет += "\nТема экзамена: $theme"
    }
    fun Balls()
    {
        try {
            print("Какое колличество баллов максимальное на экзамене? ")
            var balls = readLine()!!.toInt()
            if (balls >= 2)
                if (оценка.toInt() <= balls)
                    оценка += "/$balls"
                else
                {
                    println("Не может быть максимальное количество баллов меньше полученной оценки, введите заново")
                    Balls()
                }
            else
            {
                println("Не может быть максимальное количество баллов меньше двух, введите заново")
                Balls()
            }
        }
        catch (e:Exception)
        {
            println("Неверный формат данных, введите данные заново")
            Balls()
        }
    }
    fun Visit()
    {
        try {
            print("Студент присутствовал на экзамене? True или false: ")
            var N = readLine()!!.toBoolean()
            when (N)
            {
                false -> оценка = "0"
                true -> оценка = оценка
            }
        }
        catch (e:Exception)
        {
            println("Неверный формат данных, введите заново")
            Visit()
        }
    }
}