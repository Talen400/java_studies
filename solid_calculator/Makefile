JC := javac
JAVA := java

MAIN := Calculator

OUT := classes

SRCS := Calculator.java \
		factory_inversion/OperationFactory.java \
		handler/InputReader.java \
		handler/ResultPrinter.java \
		operations/Addition.java \
		operations/Division.java \
		operations/Multiply.java \
		operations/Operation.java \
		operations/Subtraction.java

all:
	$(JC) -d $(OUT) $(SRCS)

run: all
	$(JAVA) -cp $(OUT) $(MAIN)

clean:
	rm -rf $(OUT)

fclean: clean
	rm -rf $(MAIN)

re: fclean all

.PHONY: all run clean fclean re
