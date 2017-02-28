package org.metaborg.paplj;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.metaborg.paplj.paplj.Block2;
import org.metaborg.paplj.paplj.Expr;
import org.metaborg.paplj.paplj.Field;
import org.metaborg.paplj.paplj.Let;
import org.metaborg.paplj.paplj.Method;
import org.metaborg.paplj.paplj.Program;
import org.metaborg.paplj.paplj.Type;

/**
 * Utility functions for working with the PAPLJ model.
 */
@SuppressWarnings("all")
public class PapljModelUtil {
  public static Let asLet(final Expr e) {
    return ((Let) e);
  }
  
  /**
   * Returns the fields in a class.
   */
  public static Iterable<Field> fields(final Type c) {
    return Iterables.<Field>filter(c.getMembers(), Field.class);
  }
  
  /**
   * Returns the methods in a class.
   */
  public static Iterable<Method> methods(final Type c) {
    return Iterables.<Method>filter(c.getMembers(), Method.class);
  }
  
  /**
   * Gets the program that contains the specified object.
   */
  public static Program containingProgram(final EObject e) {
    return EcoreUtil2.<Program>getContainerOfType(e, Program.class);
  }
  
  /**
   * Gets the class that contains the specified object.
   */
  public static Type containingClass(final EObject e) {
    return EcoreUtil2.<Type>getContainerOfType(e, Type.class);
  }
  
  /**
   * Gets the method that contains the specified object.
   */
  public static Method containingMethod(final EObject e) {
    return EcoreUtil2.<Method>getContainerOfType(e, Method.class);
  }
  
  /**
   * Gets the block that contains the specified object.
   */
  public static Block2 containingBlock(final EObject e) {
    return EcoreUtil2.<Block2>getContainerOfType(e, Block2.class);
  }
  
  /**
   * Returns the distinct ancestors of the specified class,
   * starting at the direct parent of the class.
   */
  public static ArrayList<Type> ancestors(final Type c) {
    ArrayList<Type> _xblockexpression = null;
    {
      final ArrayList<Type> visited = CollectionLiterals.<Type>newArrayList();
      Type current = c.getSuperType();
      while (((current != null) && (!visited.contains(current)))) {
        {
          visited.add(current);
          current = current.getSuperType();
        }
      }
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  /**
   * Returns the let-expressions that contain the specified expression,
   * starting at the let-expression that contains the expression.
   */
  public static ArrayList<Let> lets(final Expr e) {
    ArrayList<Let> _xblockexpression = null;
    {
      final ArrayList<Let> visited = CollectionLiterals.<Let>newArrayList();
      Let current = EcoreUtil2.<Let>getContainerOfType(e, Let.class);
      while ((current != null)) {
        {
          visited.add(current);
          current = EcoreUtil2.<Let>getContainerOfType(current, Let.class);
        }
      }
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
}
