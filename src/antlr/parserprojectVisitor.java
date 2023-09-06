// Generated from C:/Users/VISION/IdeaProjects/Compiler_Project_V4/src/antlr\parserproject.g4 by ANTLR 4.10.1
package antlr;

package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parserproject}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parserprojectVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parserproject#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(parserproject.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#libraryDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryDefinition(parserproject.LibraryDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#classDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(parserproject.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#normalclassDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalclassDefinition(parserproject.NormalclassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#futerrclassDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuterrclassDefinition(parserproject.FuterrclassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#statefulWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatefulWidget(parserproject.StatefulWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#statelessWidget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatelessWidget(parserproject.StatelessWidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#buildScreen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildScreen(parserproject.BuildScreenContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#flutterline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlutterline(parserproject.FlutterlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#appBar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppBar(parserproject.AppBarContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(parserproject.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(parserproject.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRows(parserproject.RowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#children}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren(parserproject.ChildrenContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#list_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_view(parserproject.List_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#itemCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemCount(parserproject.ItemCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#itemBuilder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemBuilder(parserproject.ItemBuilderContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#gestureDetector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGestureDetector(parserproject.GestureDetectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#widgets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidgets(parserproject.WidgetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(parserproject.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#containerBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainerBody(parserproject.ContainerBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#expanded}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpanded(parserproject.ExpandedContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#child}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChild(parserproject.ChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#sizedBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizedBox(parserproject.SizedBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(parserproject.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#hieght}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHieght(parserproject.HieghtContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#onTap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnTap(parserproject.OnTapContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#setState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetState(parserproject.SetStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(parserproject.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(parserproject.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(parserproject.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#padding_bigP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding_bigP(parserproject.Padding_bigPContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#center}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCenter(parserproject.CenterContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#text_Failed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_Failed(parserproject.Text_FailedContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#elevatedButton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElevatedButton(parserproject.ElevatedButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#obscureText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObscureText(parserproject.ObscureTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#decoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoration(parserproject.DecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#container_decoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_decoration(parserproject.Container_decorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#borderRadius}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadius(parserproject.BorderRadiusContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#border}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorder(parserproject.BorderContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#labeltext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeltext(parserproject.LabeltextContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#hinttext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHinttext(parserproject.HinttextContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(parserproject.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#stringImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringImage(parserproject.StringImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(parserproject.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#uri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUri(parserproject.UriContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(parserproject.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#folderName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFolderName(parserproject.FolderNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#variabelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabelDefinition(parserproject.VariabelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(parserproject.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#voidFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(parserproject.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#typeFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFunction(parserproject.TypeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#ifDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDefinition(parserproject.IfDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#forDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDefinition(parserproject.ForDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(parserproject.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#qcOrBig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQcOrBig(parserproject.QcOrBigContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#qoOrSmal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQoOrSmal(parserproject.QoOrSmalContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#smalOrEQUAL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmalOrEQUAL(parserproject.SmalOrEQUALContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#bigOrEQUAL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigOrEQUAL(parserproject.BigOrEQUALContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#equalEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualEqual(parserproject.EqualEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#notEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(parserproject.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#variablecondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablecondition(parserproject.VariableconditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(parserproject.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link parserproject#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(parserproject.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link parserproject#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(parserproject.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULT}
	 * labeled alternative in {@link parserproject#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULT(parserproject.MULTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SlashOrDivision}
	 * labeled alternative in {@link parserproject#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashOrDivision(parserproject.SlashOrDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SUM}
	 * labeled alternative in {@link parserproject#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSUM(parserproject.SUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MINUS}
	 * labeled alternative in {@link parserproject#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMINUS(parserproject.MINUSContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#trueBoolVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueBoolVar(parserproject.TrueBoolVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#mapDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapDefinition(parserproject.MapDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(parserproject.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#publicTyeps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPublicTyeps(parserproject.PublicTyepsContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(parserproject.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#leteOrFinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeteOrFinal(parserproject.LeteOrFinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#varOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrType(parserproject.VarOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#lineWithType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineWithType(parserproject.LineWithTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#variabelForType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabelForType(parserproject.VariabelForTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(parserproject.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(parserproject.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#valueKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueKey(parserproject.ValueKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#valueValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueValue(parserproject.ValueValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#value1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue1(parserproject.Value1Context ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#value2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue2(parserproject.Value2Context ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#value3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue3(parserproject.Value3Context ctx);
	/**
	 * Visit a parse tree produced by {@link parserproject#value4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue4(parserproject.Value4Context ctx);
}