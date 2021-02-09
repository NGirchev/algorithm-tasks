package ru.girchev.tasks2021.string;

import lombok.SneakyThrows;
import ru.girchev.core.Condition;
import ru.girchev.core.Executor;
import ru.girchev.core.SolutionMethod;
import ru.girchev.core.Utils;

/**
 * Write a function, that check an input string are palindrome.
 *
 * @author Girchev N.A. Date: 09.02.2021
 */
public abstract class Task1Palindrome {

  static String input1 = "топот";
  static String input2 = "input";

  @SneakyThrows
  public static void main(String[] args) {
    Executor.start(Utils.getExecutionType(args), Task1Palindrome.class,
        new Condition(true, input1),
        new Condition(false, input2));
  }

  @SolutionMethod
  protected abstract boolean isPalindrome(String input);
}
