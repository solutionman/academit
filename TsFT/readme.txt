
Для компилирования программы в этой папке запускаем в коммандной строке:

javac academit/artamonov2017/tsft/Main.java


После этого запускаем саму программу с параметрами:

java academit/artamonov2017/tsft/Main input.txt output.txt -s -a

где параметры:
input.txt  - название сортируемого файла с расширением
output.txt - название отсортированного файла с расширением
-s  - файл содержит строки
-i  - файл содержит целые числа
-a  - сортировка по возрастанию
-b  - сортировка по убыванию


например команда:

java academit/artamonov2017/tsft/Main letters.txt sortedFile.txt -s -a

сортирует файл letters.txt по возрастанию в файл sortedFile.txt

файл sortedFile.txt будет создан в этой папке (или перезаписан с новыми данными, если уже существует)



