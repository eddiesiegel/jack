package com.rapleaf.jack.sql_operators;

import com.rapleaf.jack.SqlOperator;

public class GreaterThanOrEqualTo<N extends Number> extends SqlOperator<N> {

  public GreaterThanOrEqualTo(N number) {
    super(number);
    if (number == null) {
      throw new IllegalArgumentException("You cannot pass null parameters.");
    }
  }

  @Override
  public String getSqlStatement() {
    return " >= ? ";
  }
}
