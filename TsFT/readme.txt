
Для компилирования программы в этой папке запускаем в коммандной строке:

javac academit/artamonov2017/tsft/Main.java


После этого запускаем саму программу с параметрами:

java academit/artamonov2017/tsft/Main -a file.txt

где параметры:
file.txt  -название файла с расширением
-a  - сортировка по возрастанию
-b  - сортировка по убыванию

сортированный файл находится в файле sortedFile.txt


например команда:

java academit/artamonov2017/tsft/Main -a digits.txt

сортирует файл digits.txt по возрастанию в файл sortedFile.txt

файл sortedFile.txt будет создан в этой папке (или перезаписан с новыми данными, если уже существует)



