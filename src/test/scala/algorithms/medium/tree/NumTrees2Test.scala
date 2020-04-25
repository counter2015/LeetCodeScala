package algorithms.medium.tree

import algorithms.medium.tree.NumTrees2.{generateTrees => solve}
import algorithms.struct.{TreeNode, TreeNodeTest}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class NumTrees2Test extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val tree1 = new TreeNode(1)
    tree1.right = new TreeNode(3)
    tree1.right.left = new TreeNode(2)

    val tree2 = new TreeNode(3)
    tree2.left = new TreeNode(2)
    tree2.left.left = new TreeNode(1)

    val tree3 = new TreeNode(3)
    tree3.left = new TreeNode(1)
    tree3.left.right = new TreeNode(2)

    val tree4 = new TreeNode(2)
    tree4.left = new TreeNode(1)
    tree4.right = new TreeNode(3)

    val tree5 = new TreeNode(1)
    tree5.right = new TreeNode(2)
    tree5.right.right = new TreeNode(3)
    val res = List(tree1, tree2, tree3, tree4, tree5)
    val ans = solve(3)
    ans.forall(a => res.contains(b => sameElement(a, b)))
    res.forall(a => ans.contains(b => sameElement(a, b)))
  }

  test("test1: single node") {
    val res = List(new TreeNode(1))
    val ans = solve(1)
    ans.forall(a => res.contains(b => sameElement(a, b)))
    res.forall(a => ans.contains(b => sameElement(a, b)))
  }
}
