# Курс "Java для начинающих: с нуля до сертификата Oracle" от Заура Трегулова на Udemy

*Решения домашних заданий*

[www.udemy.com/course/java-oca-oracle/](https://www.udemy.com/course/java-oca-oracle/)

----------------------------------------------------

## Homework 1: Знакомство с Java. Методы «print» и «println».
Вывести на дисплей рубаи (четверостишье) соблюдая все отступы.

## Homework 2: Примитивные типы данных. Понятие «переменная». Системы счисления.
1. Создать по 4 переменных всех целочисленных типов данных в следующем виде и вывести их на экран:
* все 4 переменные типа byte должны равняться 12 и быть записаны в разных системах счисления;
* все 4 переменные типа short должны равняться 1300 и быть записаны в разных системах счисления;
* все 4 переменные типа int должны равняться 0 и быть записаны в разных системах счисления;
* все 4 переменные типа long должны равняться 123456789 и быть записаны в разных системах счисления;
2. Создть по 2 переменные типов данных float, double и boolean и вывести их на экран.
3. Создать n-ное количество переменных типа данные char всеми возможными способами и вывести их на экран.

## Homework 3: Арифметические и логические операции. Операции сравнения и присваивания.
1. Вычислить следующую часть кода:
```
int i1 = 5;
int i2 = 11;
double d1 = 5.5;
double d2 = 1.3;
long l = 20L;
double result1;
result1 = i2 / d1 + d2 % i1 - l;
```
2. Чему равны выражения:
* `a-- - --a + ++a + a++ + a`, где a = 5
* `++b - b++ + ++b - --b`, где b = 8

## Homework 4: Понятия «класс» и «объект». Знакомство со ссылочными типами данных
Создайте 2 класса.  

1-ый назовите `Student`. Он должен содержать в себе следующие атрибуты: номер студенческого
билета, имя, фамилию, год обучения, средняя оценка по математике, средняя оценка по
экономике, средняя оценка по иностранному языку.

2-ой класс назовите `StudentTest`. В нём Вы должны будете создать 3 разных объекта класса
`Student`, вывести на экран в читабельном виде среднюю арифметическую оценку каждого
студента (учитывая все 3 предмета).

## Homework 5: Создание объектов. Понятие «конструктор». Объявление и вызов методов.
1. В класс `BankAccount` добавьте 2 метода. Первый метод называется `popolnenieScheta`
и увеличивает баланс на сумму, которая указана в параметре этого метода. Второй метод
называется `snyatieSoScheta` и уменьшает баланс на сумму, которая указана в параметре
этого метода.
2. Измените класс `StudentTest` так, чтобы среднюю арифметическую оценку студента
выводил на экран метод. Т. е. создайте 1 метод, параметр которого – это объект класса
`Student`, а в теле метода будет вычисляться средняя арифметическая оценка и выводиться
на экран.
3. Создайте класс `Employee` с атрибутами `id`, `surname`, `age`, `salary`, `department`,
которые должны задаваться в конструкторе. В данном классе также создайте метод увеличения
зар платы вдвое. Создайте второй класс `EmployeeTest`, в котором создайте 2 объекта
класса `Employee`. Увеличьте зарплату каждому работнику вдвое с помощью метода и выведите
на экран значение новой зар платы.

## Homework 6: Перегрузка методов и конструкторов (overloading). Ключевое слово this
1. Создайте класс, в котором будут 5 overloaded методов, которые вычисляют сумму нуля,
одного, двух, трёх и четырёх  целых чисел соответственно, передают эту сумму в output и
выводят её на экран. В случае, когда слагаемые отсутствуют (т.е. когда параметров нет)
сумма пусть равняется 0.
2. Измените класс `Student` так, чтобы он имел 3 конструктора. 1-ый принимает все параметры.
2-ой – только `id`, `name`, `surname`, `course`. 3-ий не принимает значений. Создайте в
классе `StudentTest` 3 объекта с помощью разных констукторов.

## Homework 7: Понятие «package». Модификаторы видимости (access modifiers).
Пересоздайте класс `Employee` таким образом, чтобы переменная `salary` была
недоступна вне класса, переменная `surname` была доступна отовсюду, а переменная
`id` только внутри пакета.

Также создайте 3 `public` метода, которые будут показывать на дисплее значения
этих переменных. Создайте для данного класса 3 разных конструктора с `public`,
`default` и `private` access modifier-ами. В констукторах присваивайте переменным
класса значения из параметров.

Создайте новые классы в том же и в другом пакете. Попытайтесь в них создать объекты
класса `Employee` и вывести на экран значения переменных данного объекта с помощью
метода `println` и методов самого класса.

## Homework 8: Модификаторы «final» и «static». Понятие «константа».
1. В первом классе создайте 2 `static` метода. 1-ый пусть умножает 3 числа из
параметра метода и возвращает их произведение; 2-ой – делит первое
число из параметра на второе и ничего не возвращает, лишь выводит на
дисплей в читабельном виде целое частное и остаток. Во втором классе
по два раза используйте данные методы.
2. В первом классе создайте `static` `final` переменную Пи = 3,14. Используйте
данную константу в non-static методе, который принимает в параметре
значение радиуса и вычисляет площадь круга по формуле: `Площадь = Пи * радиус * радиус`.
Также используйте данную константу в `static` методе,
который принимает в параметре значение радиуса и вычисляет длину
окружности по формуле: `Площадь = 2 * Пи * радиус`. Создайте ещё один
non-static метод, который принимает в параметре значение радиуса и 
выводит на экран информацию о радиусе, площади круга и длине
окружности. Используйте все 3 метода во 2-м классе.

## Homework 9: Разновидности переменных и пределы их видимости.
1. Напишите программу, в которой будет созданно 8 объектов, но к
последней строке метода main останется всего 2.
2. Вычислите устно output-ы данных программ, а затем проверьте в среде разработки:

```java
class Test1 {
    int a = 1;
    static int a = 2;
    
    void abc(int a) {
        System.out.println(a);
        System.out.println(this.a);
    }
    
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}
   ```

```java
class Test2 {
    int a = 1;
    static int b = 2;
    
    static void abc(final int a) {
        System.out.println(a);
        System.out.println(Test2.b);
    }
    
    public static void main(String[] args) {
        abc(5);
    }
}
```

```java
class Test3 {
    int a = 1;
    static int b = 2;
    
    void abc(int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }
    
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}
```
## Homework 10: Понятия «import» и «import static». Использование комментариев.
Создайте пакет `p1`, в нём класс `А`. В пакете `p1` создайте подпакет `p2`, в нём
класс `B` со `static` элементами. В подпакете `p2` создайте подпакет `p3`, в нём
класс `C`. Создайте новый пакет `p4`, в нём класс `D`. В пакете `p4` создайте
подпакет `p5`, в нём класс `E`. Внутри класса `D` напишите код, который
будет задействовать любые элементы классов `A`, `C`, `E`, а также `static`
элементы класса `B`. Используя выражения `import` и `import static`,
работайте с не полными именами классов.

## Homework 11: Использование примитивных и ссылочных типов данных при вызове метода.
Создайте класс `Car` с тремя переменными: цвет, мотор и количество
дверей. Затем создайте класс `CarTest`, в котором должны быть 2 метода.
1-ый изменяет количество дверей объекта класса `Car` на количество,
прописанное в параметре метода. 2-ой принимает в параметры 2 объекта
класса Car и меняет их цвета местами. Примените оба метода в `main` и
выведите на экран атрибуты всех объектов.

## Homework 12: Конструкции «if» и «if else». Ternary оператор.
В классе `StudentTest` написать 2 метода, которые принимают 2 input
параметра – 2 объекта класса `Student`. Первый метод сравнивает 2-х студентов,
используя 1 `if` и логические операторы внутри него и выводит на экран информацию о том, равны ли
студенты. Второй метод использует nested `if` statement, сравнивает все
атрибуты студента по отдельности, выводит на экран информацию о том,
равны ли студенты, а если не равны, то в чём именно было обнаруженно
первое неравенство.

## Homework 13: Конструкция «switch».
В классе `Month` создайте метод, у которого 1 параметр типа данных `int`.
Этот параметр будет указывать порядковый номер месяца. Используя
функционал `switch`, выведите на экран количество дней этого месяца.
Проверьте работу данного метода в `main`.

## Homework 14: Классический цикл «for». Выражения «break» и «continue».
Создать класс. В классе создать статичный метод, который будет
выводить на экран время в формате «час:минута:секунда» в интервале от
0 до 6 часов. Если час больше единицы и минута кратна 10-ти, то метод
нужно закончить. Если же (секунда умноженная на час) больше минуты,
то пора переходить на другую минуту. Продемонстрировать данный
метод в действии.

## Homework 15: Циклы «while» и «do while».
Переписать домашнее задание 14 так, чтобы outer и
inner циклы представляли собой `while` loop, а middle цикл
представлял собой `do while` loop.

## Homework 16: Всё о классе String.
Создайте класс, в котором создайте метод email. Данный
метод должен принимать в инпут 1 `String` параметр. Данный
параметр должен содержать в себе email-ы в следующем
виде: ya@yahoo.com; on@mail.ru; ona@gmail.com.
После каждого e-mail должен стоять знак препинания “;”. Ваш
метод должен выводить на экран информацию о том, какой
почтой пользуются, исходя из параметра, т.е. оутпут должен
быть следующего вида: 

**yahoo**  
**mail**  
**gmail**  

Продемонстрируйте данный метод.

## Homework 17: Всё о классе StringBuilder.
Создайте класс, в котором создайте метод `equality`. Инпут
параметрами данного метода будут 2 объекта класса
`StringBuilder`. Метод должен иметь `boolean` return type,
возвращать `true`, если значения объектов совпадают, `false` –
если не совпадают.  
Продемонстрируйте данный метод.

## Homework 18: Понятие «массив». Работа с массивами.
1. Создайте класс, в котором создайте метод `sort`. Инпут
параметром данного метода будет одномерный массив типа
`int`. Метод должен возвращать уже отсортированный по
возрастанию массив. Продемонстрируйте данный метод.
2. Создайте класс, в котором создайте метод `showArray`. Инпут
параметром данного метода будет двумерный массив типа
`String`. Метод должен выводить на экран данный массив в
следующем виде:

**{ {элемент00, элемент01}, {элемент10}, {элемент10, элемент11} }**

Содержимое, естественно, будет зависеть от Вашего массива.  
Продемонстрируйте данный метод.

## Homework 19: Параметры метода типа varargs. Аргументы command line. Цикл foreach
Создайте метод `abc`, инпут параметр которого – N-ое
количество массивов типа `String`. В методе создайте новый
массив, который будет состоять из элементов массивов-
параметров и будет оутпутом данного метода. В методе `main`
вызовите метод abc и его элементам, которые равны
значениям command line параметров, присвойте значение
`null`. Выведите элементы обновлённого массива на экран.
Везде, где возможно, используйте `foreach loop`.
Запустите приложение с командной строки.

## Homework 20: Всё о классе ArrayList.
Создайте класс, в котором создайте метод `abc`. Инпут
параметром данного метода будет N-ое количество
параметров типа `String`. Метод должен возвращать уже
отсортированный объект `ArrayList` из неповторяющихся
объектов типа `String`, взятых из параметра метода и выводить
данный объект на экран.
Продемонстрируйте данный метод.

## Homework 21: Инкапсуляция. Super. Protected
1. Создайте класс `Student` со следующими переменными: `name` (используйте
`StringBuilder`), `course`, `grade`. Примените инкапсуляцию к данному классу.
Длина имени объектов не должна быть менее 3-х символов, оценки должны
быть числами в интервале от 1 до 10, курс должен быть числом от 1 до 4
включительно. Создайте метод `showInfo`, который будет выводить всю
информацию о студенте, не используя переменные класса напрямую.
Создайте класс `TestStudent`, в котором создайте объект класса `Student`,
придайте его переменным значения. Произведите вызов метода `showInfo`.


2. Создайте класс `Animal`. При вызове его конструктора пусть на экран выводится _"I
am animal"_. В классе пусть будут переменная `eyes`, характеризующая количество глаз;
методы `eat` (выводящий на экран _"Animal eats"_) и `drink` (выводящий на экран _"Animal
drinks"_). 

   Создайте класс `Pet`, который является child классом класса `Animal`. При вызове его
конструктора пусть на экран выводится _"I am pet"_ и переменной `eyes` придаётся
значение 2. В классе пусть будут переменные `name`; `tail`, характеризующая
количество хвостов и равная 1; `paw`, характеризующая количество лап и равная 4;
методы `run` (выводящий на экран _"Pet runs"_) и `jump` (выводящий на экран _"Pet jumps"_).   

   Создайте класс `Dog`, который является child классом класса `Pet`. При вызове его
конструктора с параметром, который будет передавать имя, пусть на экран
выводится _"I am dog and my name is: "_ + имя питомца. В класс добавьте метод `play`
(выводящий на экран _"Dog plays"_). 

   Создайте класс `Cat`, который является child классом класса `Pet`. При вызове его
конструктора с параметром, который будет передавать имя, пусть на экран
выводится _"I am cat and my name is: "_ + имя питомца. В класс добавьте метод `sleep`
(выводящий на экран _"Cat sleeps"_).   

   Создайте класс `Test`, в методе `main` которого выведите на экран количество лап
объекта класса `Dog` и вызовите метод `sleep` объекта класса `Cat`.

## Homework 22: Overriding. Hiding. Final.
**Test 1**   
Каков будет результат компиляции и запуска класса `Y`?
```java
package p1;

public class X {
    X() {}

    public void abc() {
        System.out.println('X');
    }
}
```
```java
package p2;
import p1.*;

public class Y extends X {
   Y() {}

   public void abc() {
      System.out.println('Y');
   }

   public static void main(String[] args) {
      Y y = new Y();
      y.abc();
   }
}
```
**Test 2**   
Каков будет результат компиляции и запуска класса `Y`?
```java
package p1;

public class X {
    protected void abc() {
        System.out.println('X');
    }
}
```
```java
package p2;
import p1.*;

public class Y extends X {
   public void abc() {
      System.out.println('Y');
   }

   public void def() {
      Y y = new Y();
      y.abc();
   }

   public void ghi() {
      X x = new Y();
      x.abc();
   }

   public static void main(String[] args) {
      Y a = new Y();
      a.abc();
      a.def();
      a.ghi();
   }
}
```
**Test 3**   
Каков будет результат компиляции и запуска классов `X` и `Y`?
```java
public class X {
    public X() {
        System.out.println("X");
    }

    public X(int i) {
        System.out.println("X" + i);
    }

    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        X x = new Y(18);
        System.out.println(x.abc());
    }
}

class Y extends X {
    public Y(int i) {
        System.out.println("Y");
    }

    public boolean abc() {
        return true;
    }
}
```
**Test 4**   
Каков будет результат компиляции и запуска класса `Test`?
```java
public class Test {
    public static void abc(X x, Y y) {
        System.out.println("privet");
    }

    public static void abc(Y y, X x) {
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Y a = new Y();
        abc(a, a);
    }
}

class X {
}

class Y extends X {
}
```
**Test 5**    
Каков будет результат компиляции и запуска класса `Test`?
```java
public class Test {
    public static void main(String[] args) {
        X x = new Y ();
        System.out.println(x.s1 + " " + x.bool);
    }
}

class X{
    String s1 = "privet";
}

class Y extends X {
    boolean bool = false;
}
```

## Homework 23: Абстрактные классы и интерфейсы.
Создайте абстрактный класс `Animal`, его конструктор пусть имеет параметр, значение которого
назначается переменной `String name`. В классе `Animal` создайте абстрактные методы `eat` и `sleep`.

Создайте абстрактный класс `Fish`, который является дочерним классом класса `Animal`, его конструктор
пусть имеет параметр, значение которого назначается переменным `name` данного и родительского
класса. В классе `Fish` перезапишите метод `sleep` так, чтобы он выводил на экран _"Всегда интересно
наблюдать, как спят рыбы"_. Также здесь создайте абстрактный метод `swim`.

Создайте абстрактный класс `Bird`, который является дочерним классом класса `Animal`, его конструктор
пусть имеет параметр, значение которого назначается переменным `name` данного и родительского
класса. Также здесь создайте абстрактный метод `fly`.

Создайте абстрактный класс `Mammal`, который является дочерним классом класса `Animal`, его
конструктор пусть имеет параметр, значение которого назначается переменным `name` данного и
родительского класса. Также здесь создайте абстрактный метод `run`.

Создайте интерфейс `Speakable`, в котором пусть будет дефолтный метод `speak`, который выводит на
экран _"Somebody speaks"_ . Пусть класс `Mammal` имплементирует этот интерфейс. Также пусть класс `Bird`
имплементирует этот интерфейс и перезаписывает его метод так, чтоб он выводил на экран `name` + _"
sings"_.

Создайте класс `Mechenosec`, который является дочерним классом класса `Fish`, его конструктор пусть
имеет параметр, значение которого назначается переменным `name` данного и родительского класса. В
классе `Mechenosec` перезапишите метод `swim` так, чтобы он выводил на экран _"Меченосец красивая
рыба, которая быстро плавает!"_. Также перезапишите метод `eat` так, чтобы он выводил на экран
_"Меченосец не хищная рыба, и она ест обычный рыбий корм!"_.

Создайте класс `Pingvin`, который является дочерним классом класса `Bird`, его конструктор пусть имеет
параметр, значение которого назначается переменным `name` данного и родительского класса. В классе
`Pingvin` перезапишите метод `eat` так, чтобы он выводил на экран _"Пингвин любит есть рыбу!"_. Также
перезапишите метод `sleep` так, чтобы он выводил на экран _"Пингвины спят прижавшись друг к другу!"_. Также
перезапишите метод `fly` так, чтобы он выводил на экран _"Пингвины не умеют летать!"_. Также перезапишите
метод `speak` так, чтобы он выводил на экран "_Пингвины не умеют петь как соловьи!"_.

Создайте класс `Leo`, который является дочерним классом класса `Mammal`, его конструктор пусть имеет
параметр, значение которого назначается переменным `name` данного и родительского класса. В классе
`Leo` перезапишите метод `eat` так, чтобы он выводил на экран _"Лев, как любой хищник, любит мясо!"_. Также
перезапишите метод `sleep` так, чтобы он выводил на экран _"Большую часть дня лев спит!"_. Также
перезапишите метод `run` так, чтобы он выводил на экран _"Лев - это не самая быстрая кошка!"_.

В классе `Homework23` создайте `main` метод, в котором:

1. Создайте объект класса `Mechenosec`, на который ссылается переменная типа `Mechenosec`, выведите
   переменную `name` данного объекта и вызовите все методы, которые сможете вызвать с помощью
   данной переменной;
2. Создайте объект класса `Pingvin`, на который ссылается переменная типа `Speakable`, вызовите все
   методы, которые сможете вызвать с помощью данной переменной;
3. Создайте объект класса `Leo`, на который ссылается переменная типа `Animal`, выведите переменную
   name данного объекта и вызовите все методы, которые сможете вызвать с помощью данной
   переменной;
4. Создайте ещё один объект класса `Lev`, на который ссылается переменная типа `Mammal`, выведите
   переменную `name` данного объекта и вызовите все методы, которые сможете вызвать с помощью
   данной переменной.

## Homework 24: Исключения и ошибки
Создайте 2 исключения.

Первое пусть является дочерним классом класса `RuntimeException` и называется
`NeMyasoException`; в нём создайте конструктор, который принимает 1 `String`
параметр и передаёт его конструктору `super` класса.

Второе пусть является дочерним классом
класса `Exception` и называется `NeVodaException`; в нём создайте конструктор, который
принимает 1 `String` параметр и передаёт его конструктору `super` класса.

Создайте класс `Tiger`. Первый метод класса - метод `eat` будет иметь return type `void` и
принимать 1 `String` параметр. Если данный параметр не равен “мясо”, то пусть
метод выбрасывает объект `NeMyasoException` с параметром "Тигр не ест " + параметр
метода. Если данный параметр равен String “мясо”, то пусть на экран выводится “Тигр ест мясо”.
Второй метод класса - метод `drink` будет иметь return type `void` и принимать 1 `String`
параметр. Если данный параметр не равен `String` “вода”, то пусть метод выбрасывает
объект `NeVodaException` с параметром "Тигр не пьет " + параметр метода. Если данный
параметр равен `String` “вода”, то пусть на экран выводится “Тигр пьет воду”.

В классе `Homework24` внутри метода `main` создайте объект класса `Tiger`. Вызовите метод `eat` с
параметром “мясо”. Затем в блоке `try` вызовите метод `drink` с параметром "вода". В данном
блоке `try` создайте ещё один блок `try`, где вызовите метод `drink` с параметром "пиво". Во
внешнем блоке `try` пусть также размещаются блок `catch`, который ловит исключения типа
`Exception` и в своем теле выводит на экран мессаж данного исключения; блок `catch`, который
ловит исключения типа `NeVodaException` и в своем теле выводит на экран мессаж данного
исключения; блок `finally`, который в своем теле выводит на экран "Это inner finally блок“. К
внешнему `try` блоку пусть относятся блок `catch`, который ловит исключения типа `Exception` и
в своем теле выводит на экран мессаж данного исключения; блок `catch`, который ловит
исключения типа `RuntimeException` и в своем теле выводит на экран мессаж данного
исключения.

## Homework 25: Классы, отвечающие за работу с датами и временем.
Создайте класс. Внутри класса создайте 2 шаблона с помощью класса
`DateTimeFormatter`.

1-ый шаблон подгоните под вид _«2016, января-01 !! 09:00»_, 

2-ой - под вид _«09:00, 03/фев/16»_.

Создайте метод `smena`, который принимает в
параметры объекты следующих классов: 2 объекта `LocalDateTime`, 1 объект
`Period`, 1 объект `Duration`. До тех пор, пока 1-ый объект `LocalDateTime` меньше
(раньше) 2-го проделывайте все следующие действия (даже если во время
данных действий 1-ый объект `LocalDateTime` уже не меньше 2-го) раз за разом:
1. Выводите на экран «Работаем с: » + дата и время 1-го объекта с
   использованием 1-го шаблона;
2. Увеличивайте данный (1-ый) объект на период и выводите на экран « До: » +
   дата и время изменённого 1-го объекта с использованием 1-го шаблона;
3. Выводите на экран «Отдыхаем с: » + дата и время изменённого 1-го объекта с
   использованием 2-го шаблона;
4. Увеличивайте данный (1-ый) объект на продолжительность и выводите на
   экран « До: » + дата и время изменённого 1-го объекта с использованием 2-го
   шаблона.

   Старайтесь, чтобы вывод был читабельным.

   В методе `main` создайте все необходимые объекты и запустите с их помощью
   метод `smena`.

## Homework 26: Лямбда выражения.
Создайте класс `Employee`, у которого будут переменные `name`, `department` и
`salary`. Задавайте значения этим переменным при создании объекта.

В классе `TestEmployee` создайте метод `printEmployee`, который принимает в
параметр объект класса `Employee` и выводит на экран всю информацию о данном
работнике. Используя интерфейс `Predicate`, создайте в классе `TestEmployee` метод
`employeeFilter`, который помимо объекта `Predicate` принимает в параметр
`ArrayList` работников и выводит на экран информацию о всех работниках из
`ArrayList` , которые подходят под определённые условия.

В методе `main` класса `TestEmployee` создайте `ArrayList` работников и заполните его
объектами класса `Employee`. Затем, используя данный `ArrayList` и лямбда
выражения, трижды вызовете метод `employeeFilter` таким образом, чтобы
выведенные на экран работники подходили под следующие условия:
В первый раз: департамент работника должен быть "IT", а з/п больше 200;
Во второй раз: имя работника должно начинаться с "E", а з/п не должна быть 450;
В третий раз: имя работника должно быть такое же, что и у его департамента.