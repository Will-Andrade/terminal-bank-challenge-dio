package test.java;

import main.java.TerminalAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;

public class TerminalAccountTest {
  
  @Test
  public void shouldValidateFullName() {
    assertTrue(TerminalAccount.isAPureString("Willian Andrade"));
    assertTrue(TerminalAccount.isAPureString("John"));
    assertFalse(TerminalAccount.isAPureString("John123"));
    assertFalse(TerminalAccount.isAPureString("123"));
    assertFalse(TerminalAccount.isAPureString("John Doe123"));
    assertFalse(TerminalAccount.isAPureString(" John Doe"));
    assertFalse(TerminalAccount.isAPureString("John Doe "));
    assertFalse(TerminalAccount.isAPureString("John Doe_"));
    assertFalse(TerminalAccount.isAPureString(""));
  }
  
  @Test
  public void shouldFormatTheUserBalanceToTheRightLocale() {
    Locale.setDefault(Locale.US);
    assertEquals("$1,234.56", TerminalAccount.formatBalanceToLocale(1234.56));
    
    Locale.setDefault(new Locale("pt", "BR"));
    assertEquals("R$ 1.234,56".replace(' ', '\u00A0'), TerminalAccount.formatBalanceToLocale(1234.56).replace(' ', '\u00A0'));
  }
}
