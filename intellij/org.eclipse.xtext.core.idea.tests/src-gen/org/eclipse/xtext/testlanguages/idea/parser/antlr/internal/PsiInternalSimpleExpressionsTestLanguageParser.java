package org.eclipse.xtext.testlanguages.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.eclipse.xtext.testlanguages.idea.lang.SimpleExpressionsTestLanguageElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.testlanguages.services.SimpleExpressionsTestLanguageGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalSimpleExpressionsTestLanguageParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public PsiInternalSimpleExpressionsTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalSimpleExpressionsTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalSimpleExpressionsTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g"; }



    	protected SimpleExpressionsTestLanguageGrammarAccess grammarAccess;

    	protected SimpleExpressionsTestLanguageElementTypeProvider elementTypeProvider;

    	public PsiInternalSimpleExpressionsTestLanguageParser(PsiBuilder builder, TokenStream input, SimpleExpressionsTestLanguageElementTypeProvider elementTypeProvider, SimpleExpressionsTestLanguageGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Sequence";
    	}




    // $ANTLR start "entryRuleSequence"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:52:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:52:18: ( ruleSequence EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:53:2: ruleSequence EOF
            {
             markComposite(elementTypeProvider.getSequenceElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleSequence_in_entryRuleSequence54);
            ruleSequence();

            state._fsp--;

             doneComposite(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSequence60); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:59:1: ruleSequence : ( ruleAddition ( () ( (lv_expressions_2_0= ruleAddition ) ) )* ) ;
    public final void ruleSequence() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:59:13: ( ( ruleAddition ( () ( (lv_expressions_2_0= ruleAddition ) ) )* ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:60:2: ( ruleAddition ( () ( (lv_expressions_2_0= ruleAddition ) ) )* )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:60:2: ( ruleAddition ( () ( (lv_expressions_2_0= ruleAddition ) ) )* )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:61:3: ruleAddition ( () ( (lv_expressions_2_0= ruleAddition ) ) )*
            {

            			markComposite(elementTypeProvider.getSequence_AdditionParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAddition_in_ruleSequence77);
            ruleAddition();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:68:3: ( () ( (lv_expressions_2_0= ruleAddition ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:69:4: () ( (lv_expressions_2_0= ruleAddition ) )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:69:4: ()
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:70:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getSequence_SequenceExpressionsAction_1_0ElementType());
            	    					doneComposite();
            	    				

            	    }

            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:75:4: ( (lv_expressions_2_0= ruleAddition ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:76:5: (lv_expressions_2_0= ruleAddition )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:76:5: (lv_expressions_2_0= ruleAddition )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:77:6: lv_expressions_2_0= ruleAddition
            	    {

            	    						markComposite(elementTypeProvider.getSequence_ExpressionsAdditionParserRuleCall_1_1_0ElementType());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_ruleAddition_in_ruleSequence128);
            	    ruleAddition();

            	    state._fsp--;


            	    						doneComposite();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleAddition"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:91:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:91:18: ( ruleAddition EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:92:2: ruleAddition EOF
            {
             markComposite(elementTypeProvider.getAdditionElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAddition_in_entryRuleAddition167);
            ruleAddition();

            state._fsp--;

             doneComposite(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAddition173); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:98:1: ruleAddition : ( ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )* ) ;
    public final void ruleAddition() throws RecognitionException {
        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:98:13: ( ( ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )* ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:99:2: ( ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )* )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:99:2: ( ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )* )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:100:3: ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )*
            {

            			markComposite(elementTypeProvider.getAddition_MultiplicationParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleMultiplication_in_ruleAddition190);
            ruleMultiplication();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:107:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=12)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:108:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_values_3_0= ruleMultiplication ) )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:108:4: ()
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:109:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getAddition_OpValuesAction_1_0ElementType());
            	    					doneComposite();
            	    				

            	    }

            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:114:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:115:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:115:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:116:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:116:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==11) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==12) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:117:7: lv_operator_2_1= '+'
            	            {

            	            							markLeaf();
            	            						
            	            lv_operator_2_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAddition250); 

            	            							doneLeaf(lv_operator_2_1, elementTypeProvider.getAddition_OperatorPlusSignKeyword_1_1_0_0ElementType());
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:125:7: lv_operator_2_2= '-'
            	            {

            	            							markLeaf();
            	            						
            	            lv_operator_2_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAddition288); 

            	            							doneLeaf(lv_operator_2_2, elementTypeProvider.getAddition_OperatorHyphenMinusKeyword_1_1_0_1ElementType());
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:135:4: ( (lv_values_3_0= ruleMultiplication ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:136:5: (lv_values_3_0= ruleMultiplication )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:136:5: (lv_values_3_0= ruleMultiplication )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:137:6: lv_values_3_0= ruleMultiplication
            	    {

            	    						markComposite(elementTypeProvider.getAddition_ValuesMultiplicationParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplication_in_ruleAddition341);
            	    ruleMultiplication();

            	    state._fsp--;


            	    						doneComposite();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:151:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:151:24: ( ruleMultiplication EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:152:2: ruleMultiplication EOF
            {
             markComposite(elementTypeProvider.getMultiplicationElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleMultiplication_in_entryRuleMultiplication380);
            ruleMultiplication();

            state._fsp--;

             doneComposite(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplication386); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:158:1: ruleMultiplication : ( ruleTerm ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )* ) ;
    public final void ruleMultiplication() throws RecognitionException {
        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:158:19: ( ( ruleTerm ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )* ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:159:2: ( ruleTerm ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )* )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:159:2: ( ruleTerm ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )* )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:160:3: ruleTerm ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )*
            {

            			markComposite(elementTypeProvider.getMultiplication_TermParserRuleCall_0ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleMultiplication403);
            ruleTerm();

            state._fsp--;


            			doneComposite();
            		
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:167:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:168:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_values_3_0= ruleTerm ) )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:168:4: ()
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:169:5: 
            	    {

            	    					precedeComposite(elementTypeProvider.getMultiplication_OpValuesAction_1_0ElementType());
            	    					doneComposite();
            	    				

            	    }

            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:174:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:175:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:175:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:176:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:176:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==13) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==14) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:177:7: lv_operator_2_1= '*'
            	            {

            	            							markLeaf();
            	            						
            	            lv_operator_2_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMultiplication463); 

            	            							doneLeaf(lv_operator_2_1, elementTypeProvider.getMultiplication_OperatorAsteriskKeyword_1_1_0_0ElementType());
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:185:7: lv_operator_2_2= '/'
            	            {

            	            							markLeaf();
            	            						
            	            lv_operator_2_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMultiplication501); 

            	            							doneLeaf(lv_operator_2_2, elementTypeProvider.getMultiplication_OperatorSolidusKeyword_1_1_0_1ElementType());
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:195:4: ( (lv_values_3_0= ruleTerm ) )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:196:5: (lv_values_3_0= ruleTerm )
            	    {
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:196:5: (lv_values_3_0= ruleTerm )
            	    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:197:6: lv_values_3_0= ruleTerm
            	    {

            	    						markComposite(elementTypeProvider.getMultiplication_ValuesTermParserRuleCall_1_2_0ElementType());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_ruleTerm_in_ruleMultiplication554);
            	    ruleTerm();

            	    state._fsp--;


            	    						doneComposite();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleTerm"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:211:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:211:14: ( ruleTerm EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:212:2: ruleTerm EOF
            {
             markComposite(elementTypeProvider.getTermElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleTerm_in_entryRuleTerm593);
            ruleTerm();

            state._fsp--;

             doneComposite(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTerm599); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:218:1: ruleTerm : ( ruleAtom | ruleParens ) ;
    public final void ruleTerm() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:218:9: ( ( ruleAtom | ruleParens ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:219:2: ( ruleAtom | ruleParens )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:219:2: ( ruleAtom | ruleParens )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:220:3: ruleAtom
                    {

                    			markComposite(elementTypeProvider.getTerm_AtomParserRuleCall_0ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleAtom_in_ruleTerm616);
                    ruleAtom();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:228:3: ruleParens
                    {

                    			markComposite(elementTypeProvider.getTerm_ParensParserRuleCall_1ElementType());
                    		
                    pushFollow(FollowSets000.FOLLOW_ruleParens_in_ruleTerm636);
                    ruleParens();

                    state._fsp--;


                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleAtom"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:239:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:239:14: ( ruleAtom EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:240:2: ruleAtom EOF
            {
             markComposite(elementTypeProvider.getAtomElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtom_in_entryRuleAtom656);
            ruleAtom();

            state._fsp--;

             doneComposite(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtom662); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:246:1: ruleAtom : ( (lv_name_0_0= RULE_ID ) ) ;
    public final void ruleAtom() throws RecognitionException {
        Token lv_name_0_0=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:246:9: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:247:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:247:2: ( (lv_name_0_0= RULE_ID ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:248:3: (lv_name_0_0= RULE_ID )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:248:3: (lv_name_0_0= RULE_ID )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:249:4: lv_name_0_0= RULE_ID
            {

            				markLeaf();
            			
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAtom687); 

            				doneLeaf(lv_name_0_0, elementTypeProvider.getAtom_NameIDTerminalRuleCall_0ElementType());
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleParens"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:261:1: entryRuleParens : ruleParens EOF ;
    public final void entryRuleParens() throws RecognitionException {
        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:261:16: ( ruleParens EOF )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:262:2: ruleParens EOF
            {
             markComposite(elementTypeProvider.getParensElementType()); 
            pushFollow(FollowSets000.FOLLOW_ruleParens_in_entryRuleParens712);
            ruleParens();

            state._fsp--;

             doneComposite(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParens718); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParens"


    // $ANTLR start "ruleParens"
    // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:268:1: ruleParens : (otherlv_0= '(' ruleAddition otherlv_2= ')' ) ;
    public final void ruleParens() throws RecognitionException {
        Token otherlv_0=null;
        Token otherlv_2=null;

        try {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:268:11: ( (otherlv_0= '(' ruleAddition otherlv_2= ')' ) )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:269:2: (otherlv_0= '(' ruleAddition otherlv_2= ')' )
            {
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:269:2: (otherlv_0= '(' ruleAddition otherlv_2= ')' )
            // ../../intellij/org.eclipse.xtext.core.idea.tests/src-gen/org/eclipse/xtext/testlanguages/idea/parser/antlr/internal/PsiInternalSimpleExpressionsTestLanguage.g:270:3: otherlv_0= '(' ruleAddition otherlv_2= ')'
            {

            			markLeaf();
            		
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleParens737); 

            			doneLeaf(otherlv_0, elementTypeProvider.getParens_LeftParenthesisKeyword_0ElementType());
            		

            			markComposite(elementTypeProvider.getParens_AdditionParserRuleCall_1ElementType());
            		
            pushFollow(FollowSets000.FOLLOW_ruleAddition_in_ruleParens749);
            ruleAddition();

            state._fsp--;


            			doneComposite();
            		

            			markLeaf();
            		
            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParens763); 

            			doneLeaf(otherlv_2, elementTypeProvider.getParens_RightParenthesisKeyword_2ElementType());
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleParens"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence54 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSequence60 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAddition_in_ruleSequence77 = new BitSet(new long[]{0x0000000000008012L});
        public static final BitSet FOLLOW_ruleAddition_in_ruleSequence128 = new BitSet(new long[]{0x0000000000008012L});
        public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition167 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAddition173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition190 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_11_in_ruleAddition250 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_12_in_ruleAddition288 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition341 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleMultiplication403 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_13_in_ruleMultiplication463 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_14_in_ruleMultiplication501 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleTerm_in_ruleMultiplication554 = new BitSet(new long[]{0x0000000000006002L});
        public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm593 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTerm599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtom_in_ruleTerm616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParens_in_ruleTerm636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtom662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAtom687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParens_in_entryRuleParens712 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParens718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleParens737 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_ruleAddition_in_ruleParens749 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParens763 = new BitSet(new long[]{0x0000000000000002L});
    }


}