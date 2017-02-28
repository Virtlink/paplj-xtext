package org.metaborg.paplj.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.metaborg.paplj.idea.lang.PapljElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.metaborg.paplj.services.PapljGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class PsiInternalPapljParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "';'", "'run'", "'.'", "'.*'", "'import'", "'class'", "'extends'", "'{'", "'}'", "'('", "','", "')'", "'='", "'||'", "'&&'", "'=='", "'!='", "'<'", "'+'", "'-'", "'*'", "'/'", "'as'", "'!'", "'true'", "'false'", "'this'", "'null'", "'new'", "'if'", "'else'", "'let'", "'in'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public PsiInternalPapljParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalPapljParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalPapljParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalPaplj.g"; }



    	protected PapljGrammarAccess grammarAccess;

    	protected PapljElementTypeProvider elementTypeProvider;

    	public PsiInternalPapljParser(PsiBuilder builder, TokenStream input, PapljElementTypeProvider elementTypeProvider, PapljGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
    		this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Program";
    	}




    // $ANTLR start "entryRuleProgram"
    // PsiInternalPaplj.g:52:1: entryRuleProgram returns [Boolean current=false] : iv_ruleProgram= ruleProgram EOF ;
    public final Boolean entryRuleProgram() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleProgram = null;


        try {
            // PsiInternalPaplj.g:52:49: (iv_ruleProgram= ruleProgram EOF )
            // PsiInternalPaplj.g:53:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getProgramElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // PsiInternalPaplj.g:59:1: ruleProgram returns [Boolean current=false] : ( (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleType ) )* (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )? ) ;
    public final Boolean ruleProgram() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Boolean lv_name_1_0 = null;

        Boolean lv_imports_3_0 = null;

        Boolean lv_classes_4_0 = null;

        Boolean lv_expr_6_0 = null;


        try {
            // PsiInternalPaplj.g:60:1: ( ( (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleType ) )* (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )? ) )
            // PsiInternalPaplj.g:61:2: ( (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleType ) )* (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )? )
            {
            // PsiInternalPaplj.g:61:2: ( (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleType ) )* (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )? )
            // PsiInternalPaplj.g:62:3: (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleType ) )* (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )?
            {
            // PsiInternalPaplj.g:62:3: (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // PsiInternalPaplj.g:63:4: otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )?
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getProgram_ProgramKeyword_0_0ElementType());
                      			
                    }
                    otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_0);
                      			
                    }
                    // PsiInternalPaplj.g:70:4: ( (lv_name_1_0= ruleQualifiedName ) )
                    // PsiInternalPaplj.g:71:5: (lv_name_1_0= ruleQualifiedName )
                    {
                    // PsiInternalPaplj.g:71:5: (lv_name_1_0= ruleQualifiedName )
                    // PsiInternalPaplj.g:72:6: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getProgram_NameQualifiedNameParserRuleCall_0_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalPaplj.g:85:4: (otherlv_2= ';' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==12) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // PsiInternalPaplj.g:86:5: otherlv_2= ';'
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getProgram_SemicolonKeyword_0_2ElementType());
                              				
                            }
                            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(otherlv_2);
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // PsiInternalPaplj.g:95:3: ( (lv_imports_3_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // PsiInternalPaplj.g:96:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // PsiInternalPaplj.g:96:4: (lv_imports_3_0= ruleImport )
            	    // PsiInternalPaplj.g:97:5: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getProgram_ImportsImportParserRuleCall_1_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // PsiInternalPaplj.g:110:3: ( (lv_classes_4_0= ruleType ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // PsiInternalPaplj.g:111:4: (lv_classes_4_0= ruleType )
            	    {
            	    // PsiInternalPaplj.g:111:4: (lv_classes_4_0= ruleType )
            	    // PsiInternalPaplj.g:112:5: lv_classes_4_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getProgram_ClassesTypeParserRuleCall_2_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_classes_4_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // PsiInternalPaplj.g:125:3: (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalPaplj.g:126:4: otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getProgram_RunKeyword_3_0ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }
                    // PsiInternalPaplj.g:133:4: ( (lv_expr_6_0= ruleExpr ) )
                    // PsiInternalPaplj.g:134:5: (lv_expr_6_0= ruleExpr )
                    {
                    // PsiInternalPaplj.g:134:5: (lv_expr_6_0= ruleExpr )
                    // PsiInternalPaplj.g:135:6: lv_expr_6_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getProgram_ExprExprParserRuleCall_3_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_6_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;

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
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleQualifiedName"
    // PsiInternalPaplj.g:153:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalPaplj.g:153:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalPaplj.g:154:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getQualifiedNameElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // PsiInternalPaplj.g:160:1: ruleQualifiedName returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalPaplj.g:161:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalPaplj.g:162:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalPaplj.g:162:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalPaplj.g:163:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
              		
            }
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(this_ID_0);
              		
            }
            // PsiInternalPaplj.g:170:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // PsiInternalPaplj.g:171:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	      			
            	    }
            	    kw=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(kw);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				doneLeaf(this_ID_2);
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
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
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // PsiInternalPaplj.g:190:1: entryRuleQualifiedNameWithWildcard returns [Boolean current=false] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final Boolean entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedNameWithWildcard = null;


        try {
            // PsiInternalPaplj.g:190:67: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // PsiInternalPaplj.g:191:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getQualifiedNameWithWildcardElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // PsiInternalPaplj.g:197:1: ruleQualifiedNameWithWildcard returns [Boolean current=false] : ( ruleQualifiedName (kw= '.*' )? ) ;
    public final Boolean ruleQualifiedNameWithWildcard() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalPaplj.g:198:1: ( ( ruleQualifiedName (kw= '.*' )? ) )
            // PsiInternalPaplj.g:199:2: ( ruleQualifiedName (kw= '.*' )? )
            {
            // PsiInternalPaplj.g:199:2: ( ruleQualifiedName (kw= '.*' )? )
            // PsiInternalPaplj.g:200:3: ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getQualifiedNameWithWildcard_QualifiedNameParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneComposite();
              		
            }
            // PsiInternalPaplj.g:207:3: (kw= '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalPaplj.g:208:4: kw= '.*'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getQualifiedNameWithWildcard_FullStopAsteriskKeyword_1ElementType());
                      			
                    }
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(kw);
                      			
                    }

                    }
                    break;

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
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // PsiInternalPaplj.g:220:1: entryRuleImport returns [Boolean current=false] : iv_ruleImport= ruleImport EOF ;
    public final Boolean entryRuleImport() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleImport = null;


        try {
            // PsiInternalPaplj.g:220:48: (iv_ruleImport= ruleImport EOF )
            // PsiInternalPaplj.g:221:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getImportElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // PsiInternalPaplj.g:227:1: ruleImport returns [Boolean current=false] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? ) ;
    public final Boolean ruleImport() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Boolean lv_importedNamespace_1_0 = null;


        try {
            // PsiInternalPaplj.g:228:1: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? ) )
            // PsiInternalPaplj.g:229:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? )
            {
            // PsiInternalPaplj.g:229:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? )
            // PsiInternalPaplj.g:230:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )?
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getImport_ImportKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalPaplj.g:237:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // PsiInternalPaplj.g:238:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // PsiInternalPaplj.g:238:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // PsiInternalPaplj.g:239:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getImport_ImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0ElementType());
              				
            }
            pushFollow(FOLLOW_10);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            // PsiInternalPaplj.g:252:3: (otherlv_2= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalPaplj.g:253:4: otherlv_2= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getImport_SemicolonKeyword_2ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }

                    }
                    break;

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
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // PsiInternalPaplj.g:265:1: entryRuleType returns [Boolean current=false] : iv_ruleType= ruleType EOF ;
    public final Boolean entryRuleType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleType = null;


        try {
            // PsiInternalPaplj.g:265:46: (iv_ruleType= ruleType EOF )
            // PsiInternalPaplj.g:266:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getTypeElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // PsiInternalPaplj.g:272:1: ruleType returns [Boolean current=false] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' ) ;
    public final Boolean ruleType() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_members_5_0 = null;


        try {
            // PsiInternalPaplj.g:273:1: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' ) )
            // PsiInternalPaplj.g:274:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' )
            {
            // PsiInternalPaplj.g:274:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' )
            // PsiInternalPaplj.g:275:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}'
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getType_ClassKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalPaplj.g:282:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalPaplj.g:283:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalPaplj.g:283:4: (lv_name_1_0= RULE_ID )
            // PsiInternalPaplj.g:284:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getType_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


            }

            // PsiInternalPaplj.g:299:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalPaplj.g:300:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getType_ExtendsKeyword_2_0ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }
                    // PsiInternalPaplj.g:307:4: ( ( ruleQualifiedName ) )
                    // PsiInternalPaplj.g:308:5: ( ruleQualifiedName )
                    {
                    // PsiInternalPaplj.g:308:5: ( ruleQualifiedName )
                    // PsiInternalPaplj.g:309:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getType_SuperTypeTypeCrossReference_2_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getType_LeftCurlyBracketKeyword_3ElementType());
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_4);
              		
            }
            // PsiInternalPaplj.g:332:3: ( (lv_members_5_0= ruleMember ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // PsiInternalPaplj.g:333:4: (lv_members_5_0= ruleMember )
            	    {
            	    // PsiInternalPaplj.g:333:4: (lv_members_5_0= ruleMember )
            	    // PsiInternalPaplj.g:334:5: lv_members_5_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getType_MembersMemberParserRuleCall_4_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_members_5_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getType_RightCurlyBracketKeyword_5ElementType());
              		
            }
            otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
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
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMember"
    // PsiInternalPaplj.g:358:1: entryRuleMember returns [Boolean current=false] : iv_ruleMember= ruleMember EOF ;
    public final Boolean entryRuleMember() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMember = null;


        try {
            // PsiInternalPaplj.g:358:48: (iv_ruleMember= ruleMember EOF )
            // PsiInternalPaplj.g:359:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getMemberElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // PsiInternalPaplj.g:365:1: ruleMember returns [Boolean current=false] : (this_Field_0= ruleField | this_Method_1= ruleMethod ) ;
    public final Boolean ruleMember() throws RecognitionException {
        Boolean current = false;

        Boolean this_Field_0 = null;

        Boolean this_Method_1 = null;


        try {
            // PsiInternalPaplj.g:366:1: ( (this_Field_0= ruleField | this_Method_1= ruleMethod ) )
            // PsiInternalPaplj.g:367:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            {
            // PsiInternalPaplj.g:367:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // PsiInternalPaplj.g:368:3: this_Field_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getMember_FieldParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Field_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalPaplj.g:377:3: this_Method_1= ruleMethod
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getMember_MethodParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Method_1=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Method_1;
                      			doneComposite();
                      		
                    }

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
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // PsiInternalPaplj.g:389:1: entryRuleField returns [Boolean current=false] : iv_ruleField= ruleField EOF ;
    public final Boolean entryRuleField() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleField = null;


        try {
            // PsiInternalPaplj.g:389:47: (iv_ruleField= ruleField EOF )
            // PsiInternalPaplj.g:390:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getFieldElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // PsiInternalPaplj.g:396:1: ruleField returns [Boolean current=false] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final Boolean ruleField() throws RecognitionException {
        Boolean current = false;

        Token lv_name_1_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalPaplj.g:397:1: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // PsiInternalPaplj.g:398:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // PsiInternalPaplj.g:398:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            // PsiInternalPaplj.g:399:3: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )?
            {
            // PsiInternalPaplj.g:399:3: ( ( ruleQualifiedName ) )
            // PsiInternalPaplj.g:400:4: ( ruleQualifiedName )
            {
            // PsiInternalPaplj.g:400:4: ( ruleQualifiedName )
            // PsiInternalPaplj.g:401:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getField_TypeTypeCrossReference_0_0ElementType());
              				
            }
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            // PsiInternalPaplj.g:416:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalPaplj.g:417:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalPaplj.g:417:4: (lv_name_1_0= RULE_ID )
            // PsiInternalPaplj.g:418:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getField_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


            }

            // PsiInternalPaplj.g:433:3: (otherlv_2= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // PsiInternalPaplj.g:434:4: otherlv_2= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getField_SemicolonKeyword_2ElementType());
                      			
                    }
                    otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_2);
                      			
                    }

                    }
                    break;

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
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // PsiInternalPaplj.g:446:1: entryRuleMethod returns [Boolean current=false] : iv_ruleMethod= ruleMethod EOF ;
    public final Boolean entryRuleMethod() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMethod = null;


        try {
            // PsiInternalPaplj.g:446:48: (iv_ruleMethod= ruleMethod EOF )
            // PsiInternalPaplj.g:447:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getMethodElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // PsiInternalPaplj.g:453:1: ruleMethod returns [Boolean current=false] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock2 ) ) ) ;
    public final Boolean ruleMethod() throws RecognitionException {
        Boolean current = false;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_params_3_0 = null;

        Boolean lv_params_5_0 = null;

        Boolean lv_body_7_0 = null;


        try {
            // PsiInternalPaplj.g:454:1: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock2 ) ) ) )
            // PsiInternalPaplj.g:455:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock2 ) ) )
            {
            // PsiInternalPaplj.g:455:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock2 ) ) )
            // PsiInternalPaplj.g:456:3: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock2 ) )
            {
            // PsiInternalPaplj.g:456:3: ( ( ruleQualifiedName ) )
            // PsiInternalPaplj.g:457:4: ( ruleQualifiedName )
            {
            // PsiInternalPaplj.g:457:4: ( ruleQualifiedName )
            // PsiInternalPaplj.g:458:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getMethod_TypeTypeCrossReference_0_0ElementType());
              				
            }
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            // PsiInternalPaplj.g:473:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalPaplj.g:474:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalPaplj.g:474:4: (lv_name_1_0= RULE_ID )
            // PsiInternalPaplj.g:475:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getMethod_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getMethod_LeftParenthesisKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalPaplj.g:497:3: ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // PsiInternalPaplj.g:498:4: ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )*
                    {
                    // PsiInternalPaplj.g:498:4: ( (lv_params_3_0= ruleParam ) )
                    // PsiInternalPaplj.g:499:5: (lv_params_3_0= ruleParam )
                    {
                    // PsiInternalPaplj.g:499:5: (lv_params_3_0= ruleParam )
                    // PsiInternalPaplj.g:500:6: lv_params_3_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getMethod_ParamsParamParserRuleCall_3_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_params_3_0=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalPaplj.g:513:4: (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==22) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // PsiInternalPaplj.g:514:5: otherlv_4= ',' ( (lv_params_5_0= ruleParam ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getMethod_CommaKeyword_3_1_0ElementType());
                    	      				
                    	    }
                    	    otherlv_4=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_4);
                    	      				
                    	    }
                    	    // PsiInternalPaplj.g:521:5: ( (lv_params_5_0= ruleParam ) )
                    	    // PsiInternalPaplj.g:522:6: (lv_params_5_0= ruleParam )
                    	    {
                    	    // PsiInternalPaplj.g:522:6: (lv_params_5_0= ruleParam )
                    	    // PsiInternalPaplj.g:523:7: lv_params_5_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getMethod_ParamsParamParserRuleCall_3_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_5_0=ruleParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getMethod_RightParenthesisKeyword_4ElementType());
              		
            }
            otherlv_6=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
            }
            // PsiInternalPaplj.g:545:3: ( (lv_body_7_0= ruleBlock2 ) )
            // PsiInternalPaplj.g:546:4: (lv_body_7_0= ruleBlock2 )
            {
            // PsiInternalPaplj.g:546:4: (lv_body_7_0= ruleBlock2 )
            // PsiInternalPaplj.g:547:5: lv_body_7_0= ruleBlock2
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getMethod_BodyBlock2ParserRuleCall_5_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_7_0=ruleBlock2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


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
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParam"
    // PsiInternalPaplj.g:564:1: entryRuleParam returns [Boolean current=false] : iv_ruleParam= ruleParam EOF ;
    public final Boolean entryRuleParam() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleParam = null;


        try {
            // PsiInternalPaplj.g:564:47: (iv_ruleParam= ruleParam EOF )
            // PsiInternalPaplj.g:565:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getParamElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParam; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // PsiInternalPaplj.g:571:1: ruleParam returns [Boolean current=false] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleParam() throws RecognitionException {
        Boolean current = false;

        Token lv_name_1_0=null;

        try {
            // PsiInternalPaplj.g:572:1: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalPaplj.g:573:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalPaplj.g:573:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalPaplj.g:574:3: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // PsiInternalPaplj.g:574:3: ( ( ruleQualifiedName ) )
            // PsiInternalPaplj.g:575:4: ( ruleQualifiedName )
            {
            // PsiInternalPaplj.g:575:4: ( ruleQualifiedName )
            // PsiInternalPaplj.g:576:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getParam_TypeTypeCrossReference_0_0ElementType());
              				
            }
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            // PsiInternalPaplj.g:591:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalPaplj.g:592:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalPaplj.g:592:4: (lv_name_1_0= RULE_ID )
            // PsiInternalPaplj.g:593:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getParam_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


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
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleBinding"
    // PsiInternalPaplj.g:612:1: entryRuleBinding returns [Boolean current=false] : iv_ruleBinding= ruleBinding EOF ;
    public final Boolean entryRuleBinding() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBinding = null;


        try {
            // PsiInternalPaplj.g:612:49: (iv_ruleBinding= ruleBinding EOF )
            // PsiInternalPaplj.g:613:2: iv_ruleBinding= ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getBindingElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBinding=ruleBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinding; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // PsiInternalPaplj.g:619:1: ruleBinding returns [Boolean current=false] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) ;
    public final Boolean ruleBinding() throws RecognitionException {
        Boolean current = false;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Boolean lv_value_3_0 = null;


        try {
            // PsiInternalPaplj.g:620:1: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )
            // PsiInternalPaplj.g:621:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) )
            {
            // PsiInternalPaplj.g:621:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) )
            // PsiInternalPaplj.g:622:3: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) )
            {
            // PsiInternalPaplj.g:622:3: ( ( ruleQualifiedName ) )
            // PsiInternalPaplj.g:623:4: ( ruleQualifiedName )
            {
            // PsiInternalPaplj.g:623:4: ( ruleQualifiedName )
            // PsiInternalPaplj.g:624:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getBinding_TypeTypeCrossReference_0_0ElementType());
              				
            }
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              				
            }

            }


            }

            // PsiInternalPaplj.g:639:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalPaplj.g:640:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalPaplj.g:640:4: (lv_name_1_0= RULE_ID )
            // PsiInternalPaplj.g:641:5: lv_name_1_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					markLeaf(elementTypeProvider.getBinding_NameIDTerminalRuleCall_1_0ElementType());
              				
            }
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					doneLeaf(lv_name_1_0);
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getBinding_EqualsSignKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalPaplj.g:663:3: ( (lv_value_3_0= ruleExpr ) )
            // PsiInternalPaplj.g:664:4: (lv_value_3_0= ruleExpr )
            {
            // PsiInternalPaplj.g:664:4: (lv_value_3_0= ruleExpr )
            // PsiInternalPaplj.g:665:5: lv_value_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getBinding_ValueExprParserRuleCall_3_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


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
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBlock2"
    // PsiInternalPaplj.g:682:1: entryRuleBlock2 returns [Boolean current=false] : iv_ruleBlock2= ruleBlock2 EOF ;
    public final Boolean entryRuleBlock2() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBlock2 = null;


        try {
            // PsiInternalPaplj.g:682:48: (iv_ruleBlock2= ruleBlock2 EOF )
            // PsiInternalPaplj.g:683:2: iv_ruleBlock2= ruleBlock2 EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getBlock2ElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlock2=ruleBlock2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock2; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock2"


    // $ANTLR start "ruleBlock2"
    // PsiInternalPaplj.g:689:1: ruleBlock2 returns [Boolean current=false] : ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )? (otherlv_5= ';' )? otherlv_6= '}' ) ;
    public final Boolean ruleBlock2() throws RecognitionException {
        Boolean current = false;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Boolean lv_exprs_2_0 = null;

        Boolean lv_exprs_4_0 = null;


        try {
            // PsiInternalPaplj.g:690:1: ( ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )? (otherlv_5= ';' )? otherlv_6= '}' ) )
            // PsiInternalPaplj.g:691:2: ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )? (otherlv_5= ';' )? otherlv_6= '}' )
            {
            // PsiInternalPaplj.g:691:2: ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )? (otherlv_5= ';' )? otherlv_6= '}' )
            // PsiInternalPaplj.g:692:3: () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )? (otherlv_5= ';' )? otherlv_6= '}'
            {
            // PsiInternalPaplj.g:692:3: ()
            // PsiInternalPaplj.g:693:4: 
            {
            if ( state.backtracking==0 ) {

              				precedeComposite(elementTypeProvider.getBlock2_Block2Action_0ElementType());
              				doneComposite();
              				associateWithSemanticElement();
              			
            }

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getBlock2_LeftCurlyBracketKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalPaplj.g:706:3: ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==19||LA16_0==21||LA16_0==31||(LA16_0>=35 && LA16_0<=41)||LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // PsiInternalPaplj.g:707:4: ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )*
                    {
                    // PsiInternalPaplj.g:707:4: ( (lv_exprs_2_0= ruleExpr ) )
                    // PsiInternalPaplj.g:708:5: (lv_exprs_2_0= ruleExpr )
                    {
                    // PsiInternalPaplj.g:708:5: (lv_exprs_2_0= ruleExpr )
                    // PsiInternalPaplj.g:709:6: lv_exprs_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getBlock2_ExprsExprParserRuleCall_2_0_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_exprs_2_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }

                    // PsiInternalPaplj.g:722:4: (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==12) ) {
                            int LA15_1 = input.LA(2);

                            if ( ((LA15_1>=RULE_ID && LA15_1<=RULE_INT)||LA15_1==19||LA15_1==21||LA15_1==31||(LA15_1>=35 && LA15_1<=41)||LA15_1==43) ) {
                                alt15=1;
                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // PsiInternalPaplj.g:723:5: otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) )
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      					markLeaf(elementTypeProvider.getBlock2_SemicolonKeyword_2_1_0ElementType());
                    	      				
                    	    }
                    	    otherlv_3=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					doneLeaf(otherlv_3);
                    	      				
                    	    }
                    	    // PsiInternalPaplj.g:730:5: ( (lv_exprs_4_0= ruleExpr ) )
                    	    // PsiInternalPaplj.g:731:6: (lv_exprs_4_0= ruleExpr )
                    	    {
                    	    // PsiInternalPaplj.g:731:6: (lv_exprs_4_0= ruleExpr )
                    	    // PsiInternalPaplj.g:732:7: lv_exprs_4_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							markComposite(elementTypeProvider.getBlock2_ExprsExprParserRuleCall_2_1_1_0ElementType());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_exprs_4_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							doneComposite();
                    	      							if(!current) {
                    	      								associateWithSemanticElement();
                    	      								current = true;
                    	      							}
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // PsiInternalPaplj.g:747:3: (otherlv_5= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalPaplj.g:748:4: otherlv_5= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getBlock2_SemicolonKeyword_3ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,12,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getBlock2_RightCurlyBracketKeyword_4ElementType());
              		
            }
            otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_6);
              		
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
        return current;
    }
    // $ANTLR end "ruleBlock2"


    // $ANTLR start "entryRuleExpr"
    // PsiInternalPaplj.g:767:1: entryRuleExpr returns [Boolean current=false] : iv_ruleExpr= ruleExpr EOF ;
    public final Boolean entryRuleExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleExpr = null;


        try {
            // PsiInternalPaplj.g:767:46: (iv_ruleExpr= ruleExpr EOF )
            // PsiInternalPaplj.g:768:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // PsiInternalPaplj.g:774:1: ruleExpr returns [Boolean current=false] : this_IfLetExpr_0= ruleIfLetExpr ;
    public final Boolean ruleExpr() throws RecognitionException {
        Boolean current = false;

        Boolean this_IfLetExpr_0 = null;


        try {
            // PsiInternalPaplj.g:775:1: (this_IfLetExpr_0= ruleIfLetExpr )
            // PsiInternalPaplj.g:776:2: this_IfLetExpr_0= ruleIfLetExpr
            {
            if ( state.backtracking==0 ) {

              		markComposite(elementTypeProvider.getExpr_IfLetExprParserRuleCallElementType());
              	
            }
            pushFollow(FOLLOW_2);
            this_IfLetExpr_0=ruleIfLetExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_IfLetExpr_0;
              		doneComposite();
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleIfLetExpr"
    // PsiInternalPaplj.g:787:1: entryRuleIfLetExpr returns [Boolean current=false] : iv_ruleIfLetExpr= ruleIfLetExpr EOF ;
    public final Boolean entryRuleIfLetExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIfLetExpr = null;


        try {
            // PsiInternalPaplj.g:787:51: (iv_ruleIfLetExpr= ruleIfLetExpr EOF )
            // PsiInternalPaplj.g:788:2: iv_ruleIfLetExpr= ruleIfLetExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getIfLetExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfLetExpr=ruleIfLetExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfLetExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfLetExpr"


    // $ANTLR start "ruleIfLetExpr"
    // PsiInternalPaplj.g:794:1: ruleIfLetExpr returns [Boolean current=false] : (this_If_0= ruleIf | this_Let_1= ruleLet | this_AssignmentExpr_2= ruleAssignmentExpr ) ;
    public final Boolean ruleIfLetExpr() throws RecognitionException {
        Boolean current = false;

        Boolean this_If_0 = null;

        Boolean this_Let_1 = null;

        Boolean this_AssignmentExpr_2 = null;


        try {
            // PsiInternalPaplj.g:795:1: ( (this_If_0= ruleIf | this_Let_1= ruleLet | this_AssignmentExpr_2= ruleAssignmentExpr ) )
            // PsiInternalPaplj.g:796:2: (this_If_0= ruleIf | this_Let_1= ruleLet | this_AssignmentExpr_2= ruleAssignmentExpr )
            {
            // PsiInternalPaplj.g:796:2: (this_If_0= ruleIf | this_Let_1= ruleLet | this_AssignmentExpr_2= ruleAssignmentExpr )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt18=1;
                }
                break;
            case 43:
                {
                alt18=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 19:
            case 21:
            case 31:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // PsiInternalPaplj.g:797:3: this_If_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getIfLetExpr_IfParserRuleCall_0ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_If_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_If_0;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 2 :
                    // PsiInternalPaplj.g:806:3: this_Let_1= ruleLet
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getIfLetExpr_LetParserRuleCall_1ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Let_1=ruleLet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Let_1;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 3 :
                    // PsiInternalPaplj.g:815:3: this_AssignmentExpr_2= ruleAssignmentExpr
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getIfLetExpr_AssignmentExprParserRuleCall_2ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AssignmentExpr_2=ruleAssignmentExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AssignmentExpr_2;
                      			doneComposite();
                      		
                    }

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
        return current;
    }
    // $ANTLR end "ruleIfLetExpr"


    // $ANTLR start "entryRuleAssignmentExpr"
    // PsiInternalPaplj.g:827:1: entryRuleAssignmentExpr returns [Boolean current=false] : iv_ruleAssignmentExpr= ruleAssignmentExpr EOF ;
    public final Boolean entryRuleAssignmentExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAssignmentExpr = null;


        try {
            // PsiInternalPaplj.g:827:56: (iv_ruleAssignmentExpr= ruleAssignmentExpr EOF )
            // PsiInternalPaplj.g:828:2: iv_ruleAssignmentExpr= ruleAssignmentExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getAssignmentExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentExpr=ruleAssignmentExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentExpr"


    // $ANTLR start "ruleAssignmentExpr"
    // PsiInternalPaplj.g:834:1: ruleAssignmentExpr returns [Boolean current=false] : (this_LogicalOrExpr_0= ruleLogicalOrExpr ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )? ) ;
    public final Boolean ruleAssignmentExpr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_LogicalOrExpr_0 = null;

        Boolean lv_value_3_0 = null;


        try {
            // PsiInternalPaplj.g:835:1: ( (this_LogicalOrExpr_0= ruleLogicalOrExpr ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )? ) )
            // PsiInternalPaplj.g:836:2: (this_LogicalOrExpr_0= ruleLogicalOrExpr ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )? )
            {
            // PsiInternalPaplj.g:836:2: (this_LogicalOrExpr_0= ruleLogicalOrExpr ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )? )
            // PsiInternalPaplj.g:837:3: this_LogicalOrExpr_0= ruleLogicalOrExpr ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getAssignmentExpr_LogicalOrExprParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_21);
            this_LogicalOrExpr_0=ruleLogicalOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalOrExpr_0;
              			doneComposite();
              		
            }
            // PsiInternalPaplj.g:845:3: ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) && (synpred1_PsiInternalPaplj())) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // PsiInternalPaplj.g:846:4: ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) )
                    {
                    // PsiInternalPaplj.g:857:4: ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) )
                    // PsiInternalPaplj.g:858:5: () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) )
                    {
                    // PsiInternalPaplj.g:858:5: ()
                    // PsiInternalPaplj.g:859:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						precedeComposite(elementTypeProvider.getAssignmentExpr_AssignmentLeftAction_1_0_0ElementType());
                      						doneComposite();
                      						associateWithSemanticElement();
                      					
                    }

                    }

                    if ( state.backtracking==0 ) {

                      					markLeaf(elementTypeProvider.getAssignmentExpr_EqualsSignKeyword_1_0_1ElementType());
                      				
                    }
                    otherlv_2=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					doneLeaf(otherlv_2);
                      				
                    }
                    // PsiInternalPaplj.g:872:5: ( (lv_value_3_0= ruleExpr ) )
                    // PsiInternalPaplj.g:873:6: (lv_value_3_0= ruleExpr )
                    {
                    // PsiInternalPaplj.g:873:6: (lv_value_3_0= ruleExpr )
                    // PsiInternalPaplj.g:874:7: lv_value_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      							markComposite(elementTypeProvider.getAssignmentExpr_ValueExprParserRuleCall_1_0_2_0ElementType());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							doneComposite();
                      							if(!current) {
                      								associateWithSemanticElement();
                      								current = true;
                      							}
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

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
        return current;
    }
    // $ANTLR end "ruleAssignmentExpr"


    // $ANTLR start "entryRuleLogicalOrExpr"
    // PsiInternalPaplj.g:893:1: entryRuleLogicalOrExpr returns [Boolean current=false] : iv_ruleLogicalOrExpr= ruleLogicalOrExpr EOF ;
    public final Boolean entryRuleLogicalOrExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLogicalOrExpr = null;


        try {
            // PsiInternalPaplj.g:893:55: (iv_ruleLogicalOrExpr= ruleLogicalOrExpr EOF )
            // PsiInternalPaplj.g:894:2: iv_ruleLogicalOrExpr= ruleLogicalOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getLogicalOrExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOrExpr=ruleLogicalOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpr"


    // $ANTLR start "ruleLogicalOrExpr"
    // PsiInternalPaplj.g:900:1: ruleLogicalOrExpr returns [Boolean current=false] : (this_LogicalAndExpr_0= ruleLogicalAndExpr ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )* ) ;
    public final Boolean ruleLogicalOrExpr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_LogicalAndExpr_0 = null;

        Boolean lv_right_3_0 = null;


        try {
            // PsiInternalPaplj.g:901:1: ( (this_LogicalAndExpr_0= ruleLogicalAndExpr ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )* ) )
            // PsiInternalPaplj.g:902:2: (this_LogicalAndExpr_0= ruleLogicalAndExpr ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )* )
            {
            // PsiInternalPaplj.g:902:2: (this_LogicalAndExpr_0= ruleLogicalAndExpr ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )* )
            // PsiInternalPaplj.g:903:3: this_LogicalAndExpr_0= ruleLogicalAndExpr ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getLogicalOrExpr_LogicalAndExprParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_22);
            this_LogicalAndExpr_0=ruleLogicalAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpr_0;
              			doneComposite();
              		
            }
            // PsiInternalPaplj.g:911:3: ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // PsiInternalPaplj.g:912:4: ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) )
            	    {
            	    // PsiInternalPaplj.g:912:4: ( () otherlv_2= '||' )
            	    // PsiInternalPaplj.g:913:5: () otherlv_2= '||'
            	    {
            	    // PsiInternalPaplj.g:913:5: ()
            	    // PsiInternalPaplj.g:914:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						precedeComposite(elementTypeProvider.getLogicalOrExpr_OrLeftAction_1_0_0ElementType());
            	      						doneComposite();
            	      						associateWithSemanticElement();
            	      					
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      					markLeaf(elementTypeProvider.getLogicalOrExpr_VerticalLineVerticalLineKeyword_1_0_1ElementType());
            	      				
            	    }
            	    otherlv_2=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneLeaf(otherlv_2);
            	      				
            	    }

            	    }

            	    // PsiInternalPaplj.g:928:4: ( (lv_right_3_0= ruleLogicalAndExpr ) )
            	    // PsiInternalPaplj.g:929:5: (lv_right_3_0= ruleLogicalAndExpr )
            	    {
            	    // PsiInternalPaplj.g:929:5: (lv_right_3_0= ruleLogicalAndExpr )
            	    // PsiInternalPaplj.g:930:6: lv_right_3_0= ruleLogicalAndExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getLogicalOrExpr_RightLogicalAndExprParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleLogicalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpr"


    // $ANTLR start "entryRuleLogicalAndExpr"
    // PsiInternalPaplj.g:948:1: entryRuleLogicalAndExpr returns [Boolean current=false] : iv_ruleLogicalAndExpr= ruleLogicalAndExpr EOF ;
    public final Boolean entryRuleLogicalAndExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLogicalAndExpr = null;


        try {
            // PsiInternalPaplj.g:948:56: (iv_ruleLogicalAndExpr= ruleLogicalAndExpr EOF )
            // PsiInternalPaplj.g:949:2: iv_ruleLogicalAndExpr= ruleLogicalAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getLogicalAndExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalAndExpr=ruleLogicalAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpr"


    // $ANTLR start "ruleLogicalAndExpr"
    // PsiInternalPaplj.g:955:1: ruleLogicalAndExpr returns [Boolean current=false] : (this_ComparativeExpr_0= ruleComparativeExpr ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )* ) ;
    public final Boolean ruleLogicalAndExpr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Boolean this_ComparativeExpr_0 = null;

        Boolean lv_right_3_0 = null;


        try {
            // PsiInternalPaplj.g:956:1: ( (this_ComparativeExpr_0= ruleComparativeExpr ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )* ) )
            // PsiInternalPaplj.g:957:2: (this_ComparativeExpr_0= ruleComparativeExpr ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )* )
            {
            // PsiInternalPaplj.g:957:2: (this_ComparativeExpr_0= ruleComparativeExpr ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )* )
            // PsiInternalPaplj.g:958:3: this_ComparativeExpr_0= ruleComparativeExpr ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getLogicalAndExpr_ComparativeExprParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_23);
            this_ComparativeExpr_0=ruleComparativeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparativeExpr_0;
              			doneComposite();
              		
            }
            // PsiInternalPaplj.g:966:3: ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // PsiInternalPaplj.g:967:4: ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) )
            	    {
            	    // PsiInternalPaplj.g:967:4: ( () otherlv_2= '&&' )
            	    // PsiInternalPaplj.g:968:5: () otherlv_2= '&&'
            	    {
            	    // PsiInternalPaplj.g:968:5: ()
            	    // PsiInternalPaplj.g:969:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						precedeComposite(elementTypeProvider.getLogicalAndExpr_AndLeftAction_1_0_0ElementType());
            	      						doneComposite();
            	      						associateWithSemanticElement();
            	      					
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      					markLeaf(elementTypeProvider.getLogicalAndExpr_AmpersandAmpersandKeyword_1_0_1ElementType());
            	      				
            	    }
            	    otherlv_2=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneLeaf(otherlv_2);
            	      				
            	    }

            	    }

            	    // PsiInternalPaplj.g:983:4: ( (lv_right_3_0= ruleComparativeExpr ) )
            	    // PsiInternalPaplj.g:984:5: (lv_right_3_0= ruleComparativeExpr )
            	    {
            	    // PsiInternalPaplj.g:984:5: (lv_right_3_0= ruleComparativeExpr )
            	    // PsiInternalPaplj.g:985:6: lv_right_3_0= ruleComparativeExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getLogicalAndExpr_RightComparativeExprParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleComparativeExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpr"


    // $ANTLR start "entryRuleComparativeExpr"
    // PsiInternalPaplj.g:1003:1: entryRuleComparativeExpr returns [Boolean current=false] : iv_ruleComparativeExpr= ruleComparativeExpr EOF ;
    public final Boolean entryRuleComparativeExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleComparativeExpr = null;


        try {
            // PsiInternalPaplj.g:1003:57: (iv_ruleComparativeExpr= ruleComparativeExpr EOF )
            // PsiInternalPaplj.g:1004:2: iv_ruleComparativeExpr= ruleComparativeExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getComparativeExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparativeExpr=ruleComparativeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparativeExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparativeExpr"


    // $ANTLR start "ruleComparativeExpr"
    // PsiInternalPaplj.g:1010:1: ruleComparativeExpr returns [Boolean current=false] : (this_AdditiveExpr_0= ruleAdditiveExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )? ) ;
    public final Boolean ruleComparativeExpr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean this_AdditiveExpr_0 = null;

        Boolean lv_right_7_0 = null;


        try {
            // PsiInternalPaplj.g:1011:1: ( (this_AdditiveExpr_0= ruleAdditiveExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )? ) )
            // PsiInternalPaplj.g:1012:2: (this_AdditiveExpr_0= ruleAdditiveExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )? )
            {
            // PsiInternalPaplj.g:1012:2: (this_AdditiveExpr_0= ruleAdditiveExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )? )
            // PsiInternalPaplj.g:1013:3: this_AdditiveExpr_0= ruleAdditiveExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getComparativeExpr_AdditiveExprParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_24);
            this_AdditiveExpr_0=ruleAdditiveExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpr_0;
              			doneComposite();
              		
            }
            // PsiInternalPaplj.g:1021:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=27 && LA23_0<=29)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // PsiInternalPaplj.g:1022:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) )
                    {
                    // PsiInternalPaplj.g:1022:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) )
                    int alt22=3;
                    switch ( input.LA(1) ) {
                    case 27:
                        {
                        alt22=1;
                        }
                        break;
                    case 28:
                        {
                        alt22=2;
                        }
                        break;
                    case 29:
                        {
                        alt22=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }

                    switch (alt22) {
                        case 1 :
                            // PsiInternalPaplj.g:1023:5: ( () otherlv_2= '==' )
                            {
                            // PsiInternalPaplj.g:1023:5: ( () otherlv_2= '==' )
                            // PsiInternalPaplj.g:1024:6: () otherlv_2= '=='
                            {
                            // PsiInternalPaplj.g:1024:6: ()
                            // PsiInternalPaplj.g:1025:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							precedeComposite(elementTypeProvider.getComparativeExpr_EqLeftAction_1_0_0_0ElementType());
                              							doneComposite();
                              							associateWithSemanticElement();
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						markLeaf(elementTypeProvider.getComparativeExpr_EqualsSignEqualsSignKeyword_1_0_0_1ElementType());
                              					
                            }
                            otherlv_2=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						doneLeaf(otherlv_2);
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalPaplj.g:1040:5: ( () otherlv_4= '!=' )
                            {
                            // PsiInternalPaplj.g:1040:5: ( () otherlv_4= '!=' )
                            // PsiInternalPaplj.g:1041:6: () otherlv_4= '!='
                            {
                            // PsiInternalPaplj.g:1041:6: ()
                            // PsiInternalPaplj.g:1042:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							precedeComposite(elementTypeProvider.getComparativeExpr_NeqLeftAction_1_0_1_0ElementType());
                              							doneComposite();
                              							associateWithSemanticElement();
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						markLeaf(elementTypeProvider.getComparativeExpr_ExclamationMarkEqualsSignKeyword_1_0_1_1ElementType());
                              					
                            }
                            otherlv_4=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						doneLeaf(otherlv_4);
                              					
                            }

                            }


                            }
                            break;
                        case 3 :
                            // PsiInternalPaplj.g:1057:5: ( () otherlv_6= '<' )
                            {
                            // PsiInternalPaplj.g:1057:5: ( () otherlv_6= '<' )
                            // PsiInternalPaplj.g:1058:6: () otherlv_6= '<'
                            {
                            // PsiInternalPaplj.g:1058:6: ()
                            // PsiInternalPaplj.g:1059:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							precedeComposite(elementTypeProvider.getComparativeExpr_LtLeftAction_1_0_2_0ElementType());
                              							doneComposite();
                              							associateWithSemanticElement();
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						markLeaf(elementTypeProvider.getComparativeExpr_LessThanSignKeyword_1_0_2_1ElementType());
                              					
                            }
                            otherlv_6=(Token)match(input,29,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						doneLeaf(otherlv_6);
                              					
                            }

                            }


                            }
                            break;

                    }

                    // PsiInternalPaplj.g:1074:4: ( (lv_right_7_0= ruleAdditiveExpr ) )
                    // PsiInternalPaplj.g:1075:5: (lv_right_7_0= ruleAdditiveExpr )
                    {
                    // PsiInternalPaplj.g:1075:5: (lv_right_7_0= ruleAdditiveExpr )
                    // PsiInternalPaplj.g:1076:6: lv_right_7_0= ruleAdditiveExpr
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getComparativeExpr_RightAdditiveExprParserRuleCall_1_1_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_7_0=ruleAdditiveExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }
                    break;

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
        return current;
    }
    // $ANTLR end "ruleComparativeExpr"


    // $ANTLR start "entryRuleAdditiveExpr"
    // PsiInternalPaplj.g:1094:1: entryRuleAdditiveExpr returns [Boolean current=false] : iv_ruleAdditiveExpr= ruleAdditiveExpr EOF ;
    public final Boolean entryRuleAdditiveExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAdditiveExpr = null;


        try {
            // PsiInternalPaplj.g:1094:54: (iv_ruleAdditiveExpr= ruleAdditiveExpr EOF )
            // PsiInternalPaplj.g:1095:2: iv_ruleAdditiveExpr= ruleAdditiveExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getAdditiveExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpr=ruleAdditiveExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpr"


    // $ANTLR start "ruleAdditiveExpr"
    // PsiInternalPaplj.g:1101:1: ruleAdditiveExpr returns [Boolean current=false] : (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* ) ;
    public final Boolean ruleAdditiveExpr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean this_MultiplicativeExpr_0 = null;

        Boolean lv_right_5_0 = null;


        try {
            // PsiInternalPaplj.g:1102:1: ( (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* ) )
            // PsiInternalPaplj.g:1103:2: (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* )
            {
            // PsiInternalPaplj.g:1103:2: (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* )
            // PsiInternalPaplj.g:1104:3: this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getAdditiveExpr_MultiplicativeExprParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_25);
            this_MultiplicativeExpr_0=ruleMultiplicativeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpr_0;
              			doneComposite();
              		
            }
            // PsiInternalPaplj.g:1112:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=30 && LA25_0<=31)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // PsiInternalPaplj.g:1113:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) )
            	    {
            	    // PsiInternalPaplj.g:1113:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==30) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==31) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // PsiInternalPaplj.g:1114:5: ( () otherlv_2= '+' )
            	            {
            	            // PsiInternalPaplj.g:1114:5: ( () otherlv_2= '+' )
            	            // PsiInternalPaplj.g:1115:6: () otherlv_2= '+'
            	            {
            	            // PsiInternalPaplj.g:1115:6: ()
            	            // PsiInternalPaplj.g:1116:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							precedeComposite(elementTypeProvider.getAdditiveExpr_AddLeftAction_1_0_0_0ElementType());
            	              							doneComposite();
            	              							associateWithSemanticElement();
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getAdditiveExpr_PlusSignKeyword_1_0_0_1ElementType());
            	              					
            	            }
            	            otherlv_2=(Token)match(input,30,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_2);
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalPaplj.g:1131:5: ( () otherlv_4= '-' )
            	            {
            	            // PsiInternalPaplj.g:1131:5: ( () otherlv_4= '-' )
            	            // PsiInternalPaplj.g:1132:6: () otherlv_4= '-'
            	            {
            	            // PsiInternalPaplj.g:1132:6: ()
            	            // PsiInternalPaplj.g:1133:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							precedeComposite(elementTypeProvider.getAdditiveExpr_SubLeftAction_1_0_1_0ElementType());
            	              							doneComposite();
            	              							associateWithSemanticElement();
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getAdditiveExpr_HyphenMinusKeyword_1_0_1_1ElementType());
            	              					
            	            }
            	            otherlv_4=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_4);
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // PsiInternalPaplj.g:1148:4: ( (lv_right_5_0= ruleMultiplicativeExpr ) )
            	    // PsiInternalPaplj.g:1149:5: (lv_right_5_0= ruleMultiplicativeExpr )
            	    {
            	    // PsiInternalPaplj.g:1149:5: (lv_right_5_0= ruleMultiplicativeExpr )
            	    // PsiInternalPaplj.g:1150:6: lv_right_5_0= ruleMultiplicativeExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getAdditiveExpr_RightMultiplicativeExprParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_right_5_0=ruleMultiplicativeExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
        return current;
    }
    // $ANTLR end "ruleAdditiveExpr"


    // $ANTLR start "entryRuleMultiplicativeExpr"
    // PsiInternalPaplj.g:1168:1: entryRuleMultiplicativeExpr returns [Boolean current=false] : iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF ;
    public final Boolean entryRuleMultiplicativeExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMultiplicativeExpr = null;


        try {
            // PsiInternalPaplj.g:1168:60: (iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF )
            // PsiInternalPaplj.g:1169:2: iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getMultiplicativeExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpr=ruleMultiplicativeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpr"


    // $ANTLR start "ruleMultiplicativeExpr"
    // PsiInternalPaplj.g:1175:1: ruleMultiplicativeExpr returns [Boolean current=false] : (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* ) ;
    public final Boolean ruleMultiplicativeExpr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean this_UnaryExpr_0 = null;

        Boolean lv_right_5_0 = null;


        try {
            // PsiInternalPaplj.g:1176:1: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* ) )
            // PsiInternalPaplj.g:1177:2: (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* )
            {
            // PsiInternalPaplj.g:1177:2: (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* )
            // PsiInternalPaplj.g:1178:3: this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getMultiplicativeExpr_UnaryExprParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_26);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpr_0;
              			doneComposite();
              		
            }
            // PsiInternalPaplj.g:1186:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=32 && LA27_0<=33)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // PsiInternalPaplj.g:1187:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) )
            	    {
            	    // PsiInternalPaplj.g:1187:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==32) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==33) ) {
            	        alt26=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // PsiInternalPaplj.g:1188:5: ( () otherlv_2= '*' )
            	            {
            	            // PsiInternalPaplj.g:1188:5: ( () otherlv_2= '*' )
            	            // PsiInternalPaplj.g:1189:6: () otherlv_2= '*'
            	            {
            	            // PsiInternalPaplj.g:1189:6: ()
            	            // PsiInternalPaplj.g:1190:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							precedeComposite(elementTypeProvider.getMultiplicativeExpr_MulLeftAction_1_0_0_0ElementType());
            	              							doneComposite();
            	              							associateWithSemanticElement();
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getMultiplicativeExpr_AsteriskKeyword_1_0_0_1ElementType());
            	              					
            	            }
            	            otherlv_2=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_2);
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // PsiInternalPaplj.g:1205:5: ( () otherlv_4= '/' )
            	            {
            	            // PsiInternalPaplj.g:1205:5: ( () otherlv_4= '/' )
            	            // PsiInternalPaplj.g:1206:6: () otherlv_4= '/'
            	            {
            	            // PsiInternalPaplj.g:1206:6: ()
            	            // PsiInternalPaplj.g:1207:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							precedeComposite(elementTypeProvider.getMultiplicativeExpr_DivLeftAction_1_0_1_0ElementType());
            	              							doneComposite();
            	              							associateWithSemanticElement();
            	              						
            	            }

            	            }

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getMultiplicativeExpr_SolidusKeyword_1_0_1_1ElementType());
            	              					
            	            }
            	            otherlv_4=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_4);
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // PsiInternalPaplj.g:1222:4: ( (lv_right_5_0= ruleUnaryExpr ) )
            	    // PsiInternalPaplj.g:1223:5: (lv_right_5_0= ruleUnaryExpr )
            	    {
            	    // PsiInternalPaplj.g:1223:5: (lv_right_5_0= ruleUnaryExpr )
            	    // PsiInternalPaplj.g:1224:6: lv_right_5_0= ruleUnaryExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						markComposite(elementTypeProvider.getMultiplicativeExpr_RightUnaryExprParserRuleCall_1_1_0ElementType());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_right_5_0=ruleUnaryExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						doneComposite();
            	      						if(!current) {
            	      							associateWithSemanticElement();
            	      							current = true;
            	      						}
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // PsiInternalPaplj.g:1242:1: entryRuleUnaryExpr returns [Boolean current=false] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final Boolean entryRuleUnaryExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleUnaryExpr = null;


        try {
            // PsiInternalPaplj.g:1242:51: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // PsiInternalPaplj.g:1243:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getUnaryExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpr=ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // PsiInternalPaplj.g:1249:1: ruleUnaryExpr returns [Boolean current=false] : ( (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? ) | ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) ) | ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) ) ) ;
    public final Boolean ruleUnaryExpr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Boolean this_MemberExpr_0 = null;

        Boolean lv_expr_6_0 = null;

        Boolean lv_expr_9_0 = null;


        try {
            // PsiInternalPaplj.g:1250:1: ( ( (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? ) | ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) ) | ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) ) ) )
            // PsiInternalPaplj.g:1251:2: ( (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? ) | ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) ) | ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) ) )
            {
            // PsiInternalPaplj.g:1251:2: ( (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? ) | ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) ) | ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case 19:
            case 21:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                {
                alt29=1;
                }
                break;
            case 35:
                {
                alt29=2;
                }
                break;
            case 31:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // PsiInternalPaplj.g:1252:3: (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? )
                    {
                    // PsiInternalPaplj.g:1252:3: (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? )
                    // PsiInternalPaplj.g:1253:4: this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getUnaryExpr_MemberExprParserRuleCall_0_0ElementType());
                      			
                    }
                    pushFollow(FOLLOW_27);
                    this_MemberExpr_0=ruleMemberExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MemberExpr_0;
                      				doneComposite();
                      			
                    }
                    // PsiInternalPaplj.g:1261:4: ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==34) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // PsiInternalPaplj.g:1262:5: ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) )
                            {
                            // PsiInternalPaplj.g:1262:5: ( () otherlv_2= 'as' )
                            // PsiInternalPaplj.g:1263:6: () otherlv_2= 'as'
                            {
                            // PsiInternalPaplj.g:1263:6: ()
                            // PsiInternalPaplj.g:1264:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							precedeComposite(elementTypeProvider.getUnaryExpr_CastLeftAction_0_1_0_0ElementType());
                              							doneComposite();
                              							associateWithSemanticElement();
                              						
                            }

                            }

                            if ( state.backtracking==0 ) {

                              						markLeaf(elementTypeProvider.getUnaryExpr_AsKeyword_0_1_0_1ElementType());
                              					
                            }
                            otherlv_2=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						doneLeaf(otherlv_2);
                              					
                            }

                            }

                            // PsiInternalPaplj.g:1278:5: ( (otherlv_3= RULE_ID ) )
                            // PsiInternalPaplj.g:1279:6: (otherlv_3= RULE_ID )
                            {
                            // PsiInternalPaplj.g:1279:6: (otherlv_3= RULE_ID )
                            // PsiInternalPaplj.g:1280:7: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              							if (!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getUnaryExpr_TypeTypeCrossReference_0_1_1_0ElementType());
                              						
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(otherlv_3);
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalPaplj.g:1298:3: ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) )
                    {
                    // PsiInternalPaplj.g:1298:3: ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) )
                    // PsiInternalPaplj.g:1299:4: () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) )
                    {
                    // PsiInternalPaplj.g:1299:4: ()
                    // PsiInternalPaplj.g:1300:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getUnaryExpr_NotAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getUnaryExpr_ExclamationMarkKeyword_1_1ElementType());
                      			
                    }
                    otherlv_5=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_5);
                      			
                    }
                    // PsiInternalPaplj.g:1313:4: ( (lv_expr_6_0= ruleUnaryExpr ) )
                    // PsiInternalPaplj.g:1314:5: (lv_expr_6_0= ruleUnaryExpr )
                    {
                    // PsiInternalPaplj.g:1314:5: (lv_expr_6_0= ruleUnaryExpr )
                    // PsiInternalPaplj.g:1315:6: lv_expr_6_0= ruleUnaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getUnaryExpr_ExprUnaryExprParserRuleCall_1_2_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_6_0=ruleUnaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalPaplj.g:1330:3: ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) )
                    {
                    // PsiInternalPaplj.g:1330:3: ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) )
                    // PsiInternalPaplj.g:1331:4: () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) )
                    {
                    // PsiInternalPaplj.g:1331:4: ()
                    // PsiInternalPaplj.g:1332:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getUnaryExpr_MinAction_2_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getUnaryExpr_HyphenMinusKeyword_2_1ElementType());
                      			
                    }
                    otherlv_8=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_8);
                      			
                    }
                    // PsiInternalPaplj.g:1345:4: ( (lv_expr_9_0= ruleUnaryExpr ) )
                    // PsiInternalPaplj.g:1346:5: (lv_expr_9_0= ruleUnaryExpr )
                    {
                    // PsiInternalPaplj.g:1346:5: (lv_expr_9_0= ruleUnaryExpr )
                    // PsiInternalPaplj.g:1347:6: lv_expr_9_0= ruleUnaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getUnaryExpr_ExprUnaryExprParserRuleCall_2_2_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_9_0=ruleUnaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }

                    }


                    }


                    }


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
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleMemberExpr"
    // PsiInternalPaplj.g:1365:1: entryRuleMemberExpr returns [Boolean current=false] : iv_ruleMemberExpr= ruleMemberExpr EOF ;
    public final Boolean entryRuleMemberExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMemberExpr = null;


        try {
            // PsiInternalPaplj.g:1365:52: (iv_ruleMemberExpr= ruleMemberExpr EOF )
            // PsiInternalPaplj.g:1366:2: iv_ruleMemberExpr= ruleMemberExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getMemberExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMemberExpr=ruleMemberExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberExpr"


    // $ANTLR start "ruleMemberExpr"
    // PsiInternalPaplj.g:1372:1: ruleMemberExpr returns [Boolean current=false] : (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )* ) ;
    public final Boolean ruleMemberExpr() throws RecognitionException {
        Boolean current = false;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_methodInvocation_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Boolean this_PrimaryExpr_0 = null;

        Boolean lv_args_5_0 = null;

        Boolean lv_args_7_0 = null;


        try {
            // PsiInternalPaplj.g:1373:1: ( (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )* ) )
            // PsiInternalPaplj.g:1374:2: (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )* )
            {
            // PsiInternalPaplj.g:1374:2: (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )* )
            // PsiInternalPaplj.g:1375:3: this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {

              			markComposite(elementTypeProvider.getMemberExpr_PrimaryExprParserRuleCall_0ElementType());
              		
            }
            pushFollow(FOLLOW_8);
            this_PrimaryExpr_0=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpr_0;
              			doneComposite();
              		
            }
            // PsiInternalPaplj.g:1383:3: ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==14) && (synpred2_PsiInternalPaplj())) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // PsiInternalPaplj.g:1384:4: ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? )
            	    {
            	    // PsiInternalPaplj.g:1418:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? )
            	    // PsiInternalPaplj.g:1419:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // PsiInternalPaplj.g:1419:5: ()
            	    // PsiInternalPaplj.g:1420:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						precedeComposite(elementTypeProvider.getMemberExpr_MemberRefLeftAction_1_0_0ElementType());
            	      						doneComposite();
            	      						associateWithSemanticElement();
            	      					
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      					markLeaf(elementTypeProvider.getMemberExpr_FullStopKeyword_1_0_1ElementType());
            	      				
            	    }
            	    otherlv_2=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneLeaf(otherlv_2);
            	      				
            	    }
            	    // PsiInternalPaplj.g:1433:5: ( (otherlv_3= RULE_ID ) )
            	    // PsiInternalPaplj.g:1434:6: (otherlv_3= RULE_ID )
            	    {
            	    // PsiInternalPaplj.g:1434:6: (otherlv_3= RULE_ID )
            	    // PsiInternalPaplj.g:1435:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (!current) {
            	      								associateWithSemanticElement();
            	      								current = true;
            	      							}
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							markLeaf(elementTypeProvider.getMemberExpr_MemberMemberCrossReference_1_0_2_0ElementType());
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							doneLeaf(otherlv_3);
            	      						
            	    }

            	    }


            	    }

            	    // PsiInternalPaplj.g:1450:5: ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==21) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // PsiInternalPaplj.g:1451:6: ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')'
            	            {
            	            // PsiInternalPaplj.g:1451:6: ( (lv_methodInvocation_4_0= '(' ) )
            	            // PsiInternalPaplj.g:1452:7: (lv_methodInvocation_4_0= '(' )
            	            {
            	            // PsiInternalPaplj.g:1452:7: (lv_methodInvocation_4_0= '(' )
            	            // PsiInternalPaplj.g:1453:8: lv_methodInvocation_4_0= '('
            	            {
            	            if ( state.backtracking==0 ) {

            	              								markLeaf(elementTypeProvider.getMemberExpr_MethodInvocationLeftParenthesisKeyword_1_0_3_0_0ElementType());
            	              							
            	            }
            	            lv_methodInvocation_4_0=(Token)match(input,21,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								doneLeaf(lv_methodInvocation_4_0);
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (!current) {
            	              									associateWithSemanticElement();
            	              									current = true;
            	              								}
            	              							
            	            }

            	            }


            	            }

            	            // PsiInternalPaplj.g:1468:6: ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )?
            	            int alt31=2;
            	            int LA31_0 = input.LA(1);

            	            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||LA31_0==19||LA31_0==21||LA31_0==31||(LA31_0>=35 && LA31_0<=41)||LA31_0==43) ) {
            	                alt31=1;
            	            }
            	            switch (alt31) {
            	                case 1 :
            	                    // PsiInternalPaplj.g:1469:7: ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )*
            	                    {
            	                    // PsiInternalPaplj.g:1469:7: ( (lv_args_5_0= ruleExpr ) )
            	                    // PsiInternalPaplj.g:1470:8: (lv_args_5_0= ruleExpr )
            	                    {
            	                    // PsiInternalPaplj.g:1470:8: (lv_args_5_0= ruleExpr )
            	                    // PsiInternalPaplj.g:1471:9: lv_args_5_0= ruleExpr
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      									markComposite(elementTypeProvider.getMemberExpr_ArgsExprParserRuleCall_1_0_3_1_0_0ElementType());
            	                      								
            	                    }
            	                    pushFollow(FOLLOW_16);
            	                    lv_args_5_0=ruleExpr();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      									doneComposite();
            	                      									if(!current) {
            	                      										associateWithSemanticElement();
            	                      										current = true;
            	                      									}
            	                      								
            	                    }

            	                    }


            	                    }

            	                    // PsiInternalPaplj.g:1484:7: (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )*
            	                    loop30:
            	                    do {
            	                        int alt30=2;
            	                        int LA30_0 = input.LA(1);

            	                        if ( (LA30_0==22) ) {
            	                            alt30=1;
            	                        }


            	                        switch (alt30) {
            	                    	case 1 :
            	                    	    // PsiInternalPaplj.g:1485:8: otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) )
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      								markLeaf(elementTypeProvider.getMemberExpr_CommaKeyword_1_0_3_1_1_0ElementType());
            	                    	      							
            	                    	    }
            	                    	    otherlv_6=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      								doneLeaf(otherlv_6);
            	                    	      							
            	                    	    }
            	                    	    // PsiInternalPaplj.g:1492:8: ( (lv_args_7_0= ruleExpr ) )
            	                    	    // PsiInternalPaplj.g:1493:9: (lv_args_7_0= ruleExpr )
            	                    	    {
            	                    	    // PsiInternalPaplj.g:1493:9: (lv_args_7_0= ruleExpr )
            	                    	    // PsiInternalPaplj.g:1494:10: lv_args_7_0= ruleExpr
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      										markComposite(elementTypeProvider.getMemberExpr_ArgsExprParserRuleCall_1_0_3_1_1_1_0ElementType());
            	                    	      									
            	                    	    }
            	                    	    pushFollow(FOLLOW_16);
            	                    	    lv_args_7_0=ruleExpr();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      										doneComposite();
            	                    	      										if(!current) {
            	                    	      											associateWithSemanticElement();
            	                    	      											current = true;
            	                    	      										}
            	                    	      									
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop30;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            if ( state.backtracking==0 ) {

            	              						markLeaf(elementTypeProvider.getMemberExpr_RightParenthesisKeyword_1_0_3_2ElementType());
            	              					
            	            }
            	            otherlv_8=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						doneLeaf(otherlv_8);
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
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
        return current;
    }
    // $ANTLR end "ruleMemberExpr"


    // $ANTLR start "entryRulePrimaryExpr"
    // PsiInternalPaplj.g:1523:1: entryRulePrimaryExpr returns [Boolean current=false] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final Boolean entryRulePrimaryExpr() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePrimaryExpr = null;


        try {
            // PsiInternalPaplj.g:1523:53: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // PsiInternalPaplj.g:1524:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getPrimaryExprElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // PsiInternalPaplj.g:1530:1: rulePrimaryExpr returns [Boolean current=false] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= 'this' ) | ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? ) | ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' ) | ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? ) | this_Block2_22= ruleBlock2 | (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' ) ) ;
    public final Boolean rulePrimaryExpr() throws RecognitionException {
        Boolean current = false;

        Token lv_value_1_0=null;
        Token lv_true_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token lv_methodInvocation_17_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Boolean lv_args_18_0 = null;

        Boolean lv_args_20_0 = null;

        Boolean this_Block2_22 = null;

        Boolean this_Expr_24 = null;


        try {
            // PsiInternalPaplj.g:1531:1: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= 'this' ) | ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? ) | ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' ) | ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? ) | this_Block2_22= ruleBlock2 | (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' ) ) )
            // PsiInternalPaplj.g:1532:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= 'this' ) | ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? ) | ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' ) | ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? ) | this_Block2_22= ruleBlock2 | (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' ) )
            {
            // PsiInternalPaplj.g:1532:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= 'this' ) | ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? ) | ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' ) | ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? ) | this_Block2_22= ruleBlock2 | (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' ) )
            int alt39=8;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt39=1;
                }
                break;
            case 36:
            case 37:
                {
                alt39=2;
                }
                break;
            case 38:
                {
                alt39=3;
                }
                break;
            case 39:
                {
                alt39=4;
                }
                break;
            case 40:
                {
                alt39=5;
                }
                break;
            case RULE_ID:
                {
                alt39=6;
                }
                break;
            case 19:
                {
                alt39=7;
                }
                break;
            case 21:
                {
                alt39=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // PsiInternalPaplj.g:1533:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // PsiInternalPaplj.g:1533:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // PsiInternalPaplj.g:1534:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // PsiInternalPaplj.g:1534:4: ()
                    // PsiInternalPaplj.g:1535:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getPrimaryExpr_NumAction_0_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalPaplj.g:1541:4: ( (lv_value_1_0= RULE_INT ) )
                    // PsiInternalPaplj.g:1542:5: (lv_value_1_0= RULE_INT )
                    {
                    // PsiInternalPaplj.g:1542:5: (lv_value_1_0= RULE_INT )
                    // PsiInternalPaplj.g:1543:6: lv_value_1_0= RULE_INT
                    {
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getPrimaryExpr_ValueINTTerminalRuleCall_0_1_0ElementType());
                      					
                    }
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if(!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						doneLeaf(lv_value_1_0);
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalPaplj.g:1560:3: ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    {
                    // PsiInternalPaplj.g:1560:3: ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    // PsiInternalPaplj.g:1561:4: () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' )
                    {
                    // PsiInternalPaplj.g:1561:4: ()
                    // PsiInternalPaplj.g:1562:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getPrimaryExpr_BoolAction_1_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalPaplj.g:1568:4: ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==36) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==37) ) {
                        alt34=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // PsiInternalPaplj.g:1569:5: ( (lv_true_3_0= 'true' ) )
                            {
                            // PsiInternalPaplj.g:1569:5: ( (lv_true_3_0= 'true' ) )
                            // PsiInternalPaplj.g:1570:6: (lv_true_3_0= 'true' )
                            {
                            // PsiInternalPaplj.g:1570:6: (lv_true_3_0= 'true' )
                            // PsiInternalPaplj.g:1571:7: lv_true_3_0= 'true'
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getPrimaryExpr_TrueTrueKeyword_1_1_0_0ElementType());
                              						
                            }
                            lv_true_3_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_true_3_0);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // PsiInternalPaplj.g:1587:5: otherlv_4= 'false'
                            {
                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getPrimaryExpr_FalseKeyword_1_1_1ElementType());
                              				
                            }
                            otherlv_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(otherlv_4);
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalPaplj.g:1597:3: ( () otherlv_6= 'this' )
                    {
                    // PsiInternalPaplj.g:1597:3: ( () otherlv_6= 'this' )
                    // PsiInternalPaplj.g:1598:4: () otherlv_6= 'this'
                    {
                    // PsiInternalPaplj.g:1598:4: ()
                    // PsiInternalPaplj.g:1599:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getPrimaryExpr_ThisAction_2_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPrimaryExpr_ThisKeyword_2_1ElementType());
                      			
                    }
                    otherlv_6=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_6);
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // PsiInternalPaplj.g:1614:3: ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? )
                    {
                    // PsiInternalPaplj.g:1614:3: ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? )
                    // PsiInternalPaplj.g:1615:4: () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )?
                    {
                    // PsiInternalPaplj.g:1615:4: ()
                    // PsiInternalPaplj.g:1616:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getPrimaryExpr_NullAction_3_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPrimaryExpr_NullKeyword_3_1ElementType());
                      			
                    }
                    otherlv_8=(Token)match(input,39,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_8);
                      			
                    }
                    // PsiInternalPaplj.g:1629:4: ( (otherlv_9= RULE_ID ) )?
                    int alt35=2;
                    alt35 = dfa35.predict(input);
                    switch (alt35) {
                        case 1 :
                            // PsiInternalPaplj.g:1630:5: (otherlv_9= RULE_ID )
                            {
                            // PsiInternalPaplj.g:1630:5: (otherlv_9= RULE_ID )
                            // PsiInternalPaplj.g:1631:6: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              						if (!current) {
                              							associateWithSemanticElement();
                              							current = true;
                              						}
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						markLeaf(elementTypeProvider.getPrimaryExpr_TypeTypeCrossReference_3_2_0ElementType());
                              					
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						doneLeaf(otherlv_9);
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // PsiInternalPaplj.g:1648:3: ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' )
                    {
                    // PsiInternalPaplj.g:1648:3: ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' )
                    // PsiInternalPaplj.g:1649:4: () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')'
                    {
                    // PsiInternalPaplj.g:1649:4: ()
                    // PsiInternalPaplj.g:1650:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getPrimaryExpr_NewAction_4_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPrimaryExpr_NewKeyword_4_1ElementType());
                      			
                    }
                    otherlv_11=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_11);
                      			
                    }
                    // PsiInternalPaplj.g:1663:4: ( ( ruleQualifiedName ) )
                    // PsiInternalPaplj.g:1664:5: ( ruleQualifiedName )
                    {
                    // PsiInternalPaplj.g:1664:5: ( ruleQualifiedName )
                    // PsiInternalPaplj.g:1665:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						markComposite(elementTypeProvider.getPrimaryExpr_TypeTypeCrossReference_4_2_0ElementType());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneComposite();
                      					
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPrimaryExpr_LeftParenthesisKeyword_4_3ElementType());
                      			
                    }
                    otherlv_13=(Token)match(input,21,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_13);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPrimaryExpr_RightParenthesisKeyword_4_4ElementType());
                      			
                    }
                    otherlv_14=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_14);
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // PsiInternalPaplj.g:1696:3: ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? )
                    {
                    // PsiInternalPaplj.g:1696:3: ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? )
                    // PsiInternalPaplj.g:1697:4: () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )?
                    {
                    // PsiInternalPaplj.g:1697:4: ()
                    // PsiInternalPaplj.g:1698:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					precedeComposite(elementTypeProvider.getPrimaryExpr_VarAction_5_0ElementType());
                      					doneComposite();
                      					associateWithSemanticElement();
                      				
                    }

                    }

                    // PsiInternalPaplj.g:1704:4: ( (otherlv_16= RULE_ID ) )
                    // PsiInternalPaplj.g:1705:5: (otherlv_16= RULE_ID )
                    {
                    // PsiInternalPaplj.g:1705:5: (otherlv_16= RULE_ID )
                    // PsiInternalPaplj.g:1706:6: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (!current) {
                      							associateWithSemanticElement();
                      							current = true;
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						markLeaf(elementTypeProvider.getPrimaryExpr_MemberSymbolCrossReference_5_1_0ElementType());
                      					
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						doneLeaf(otherlv_16);
                      					
                    }

                    }


                    }

                    // PsiInternalPaplj.g:1721:4: ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==21) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // PsiInternalPaplj.g:1722:5: ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')'
                            {
                            // PsiInternalPaplj.g:1722:5: ( (lv_methodInvocation_17_0= '(' ) )
                            // PsiInternalPaplj.g:1723:6: (lv_methodInvocation_17_0= '(' )
                            {
                            // PsiInternalPaplj.g:1723:6: (lv_methodInvocation_17_0= '(' )
                            // PsiInternalPaplj.g:1724:7: lv_methodInvocation_17_0= '('
                            {
                            if ( state.backtracking==0 ) {

                              							markLeaf(elementTypeProvider.getPrimaryExpr_MethodInvocationLeftParenthesisKeyword_5_2_0_0ElementType());
                              						
                            }
                            lv_methodInvocation_17_0=(Token)match(input,21,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							doneLeaf(lv_methodInvocation_17_0);
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (!current) {
                              								associateWithSemanticElement();
                              								current = true;
                              							}
                              						
                            }

                            }


                            }

                            // PsiInternalPaplj.g:1739:5: ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_INT)||LA37_0==19||LA37_0==21||LA37_0==31||(LA37_0>=35 && LA37_0<=41)||LA37_0==43) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // PsiInternalPaplj.g:1740:6: ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )*
                                    {
                                    // PsiInternalPaplj.g:1740:6: ( (lv_args_18_0= ruleExpr ) )
                                    // PsiInternalPaplj.g:1741:7: (lv_args_18_0= ruleExpr )
                                    {
                                    // PsiInternalPaplj.g:1741:7: (lv_args_18_0= ruleExpr )
                                    // PsiInternalPaplj.g:1742:8: lv_args_18_0= ruleExpr
                                    {
                                    if ( state.backtracking==0 ) {

                                      								markComposite(elementTypeProvider.getPrimaryExpr_ArgsExprParserRuleCall_5_2_1_0_0ElementType());
                                      							
                                    }
                                    pushFollow(FOLLOW_16);
                                    lv_args_18_0=ruleExpr();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								doneComposite();
                                      								if(!current) {
                                      									associateWithSemanticElement();
                                      									current = true;
                                      								}
                                      							
                                    }

                                    }


                                    }

                                    // PsiInternalPaplj.g:1755:6: (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )*
                                    loop36:
                                    do {
                                        int alt36=2;
                                        int LA36_0 = input.LA(1);

                                        if ( (LA36_0==22) ) {
                                            alt36=1;
                                        }


                                        switch (alt36) {
                                    	case 1 :
                                    	    // PsiInternalPaplj.g:1756:7: otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) )
                                    	    {
                                    	    if ( state.backtracking==0 ) {

                                    	      							markLeaf(elementTypeProvider.getPrimaryExpr_CommaKeyword_5_2_1_1_0ElementType());
                                    	      						
                                    	    }
                                    	    otherlv_19=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      							doneLeaf(otherlv_19);
                                    	      						
                                    	    }
                                    	    // PsiInternalPaplj.g:1763:7: ( (lv_args_20_0= ruleExpr ) )
                                    	    // PsiInternalPaplj.g:1764:8: (lv_args_20_0= ruleExpr )
                                    	    {
                                    	    // PsiInternalPaplj.g:1764:8: (lv_args_20_0= ruleExpr )
                                    	    // PsiInternalPaplj.g:1765:9: lv_args_20_0= ruleExpr
                                    	    {
                                    	    if ( state.backtracking==0 ) {

                                    	      									markComposite(elementTypeProvider.getPrimaryExpr_ArgsExprParserRuleCall_5_2_1_1_1_0ElementType());
                                    	      								
                                    	    }
                                    	    pushFollow(FOLLOW_16);
                                    	    lv_args_20_0=ruleExpr();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      									doneComposite();
                                    	      									if(!current) {
                                    	      										associateWithSemanticElement();
                                    	      										current = true;
                                    	      									}
                                    	      								
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop36;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {

                              					markLeaf(elementTypeProvider.getPrimaryExpr_RightParenthesisKeyword_5_2_2ElementType());
                              				
                            }
                            otherlv_21=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					doneLeaf(otherlv_21);
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // PsiInternalPaplj.g:1790:3: this_Block2_22= ruleBlock2
                    {
                    if ( state.backtracking==0 ) {

                      			markComposite(elementTypeProvider.getPrimaryExpr_Block2ParserRuleCall_6ElementType());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block2_22=ruleBlock2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Block2_22;
                      			doneComposite();
                      		
                    }

                    }
                    break;
                case 8 :
                    // PsiInternalPaplj.g:1799:3: (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' )
                    {
                    // PsiInternalPaplj.g:1799:3: (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' )
                    // PsiInternalPaplj.g:1800:4: otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')'
                    {
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPrimaryExpr_LeftParenthesisKeyword_7_0ElementType());
                      			
                    }
                    otherlv_23=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_23);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markComposite(elementTypeProvider.getPrimaryExpr_ExprParserRuleCall_7_1ElementType());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_Expr_24=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expr_24;
                      				doneComposite();
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				markLeaf(elementTypeProvider.getPrimaryExpr_RightParenthesisKeyword_7_2ElementType());
                      			
                    }
                    otherlv_25=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				doneLeaf(otherlv_25);
                      			
                    }

                    }


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
        return current;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleIf"
    // PsiInternalPaplj.g:1827:1: entryRuleIf returns [Boolean current=false] : iv_ruleIf= ruleIf EOF ;
    public final Boolean entryRuleIf() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleIf = null;


        try {
            // PsiInternalPaplj.g:1827:44: (iv_ruleIf= ruleIf EOF )
            // PsiInternalPaplj.g:1828:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getIfElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // PsiInternalPaplj.g:1834:1: ruleIf returns [Boolean current=false] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_onTrue_4_0= ruleExpr ) ) otherlv_5= 'else' ( (lv_onFalse_6_0= ruleExpr ) ) ) ;
    public final Boolean ruleIf() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Boolean lv_condition_2_0 = null;

        Boolean lv_onTrue_4_0 = null;

        Boolean lv_onFalse_6_0 = null;


        try {
            // PsiInternalPaplj.g:1835:1: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_onTrue_4_0= ruleExpr ) ) otherlv_5= 'else' ( (lv_onFalse_6_0= ruleExpr ) ) ) )
            // PsiInternalPaplj.g:1836:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_onTrue_4_0= ruleExpr ) ) otherlv_5= 'else' ( (lv_onFalse_6_0= ruleExpr ) ) )
            {
            // PsiInternalPaplj.g:1836:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_onTrue_4_0= ruleExpr ) ) otherlv_5= 'else' ( (lv_onFalse_6_0= ruleExpr ) ) )
            // PsiInternalPaplj.g:1837:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_onTrue_4_0= ruleExpr ) ) otherlv_5= 'else' ( (lv_onFalse_6_0= ruleExpr ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getIf_IfKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,41,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getIf_LeftParenthesisKeyword_1ElementType());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_1);
              		
            }
            // PsiInternalPaplj.g:1851:3: ( (lv_condition_2_0= ruleExpr ) )
            // PsiInternalPaplj.g:1852:4: (lv_condition_2_0= ruleExpr )
            {
            // PsiInternalPaplj.g:1852:4: (lv_condition_2_0= ruleExpr )
            // PsiInternalPaplj.g:1853:5: lv_condition_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getIf_ConditionExprParserRuleCall_2_0ElementType());
              				
            }
            pushFollow(FOLLOW_31);
            lv_condition_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getIf_RightParenthesisKeyword_3ElementType());
              		
            }
            otherlv_3=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_3);
              		
            }
            // PsiInternalPaplj.g:1873:3: ( (lv_onTrue_4_0= ruleExpr ) )
            // PsiInternalPaplj.g:1874:4: (lv_onTrue_4_0= ruleExpr )
            {
            // PsiInternalPaplj.g:1874:4: (lv_onTrue_4_0= ruleExpr )
            // PsiInternalPaplj.g:1875:5: lv_onTrue_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getIf_OnTrueExprParserRuleCall_4_0ElementType());
              				
            }
            pushFollow(FOLLOW_33);
            lv_onTrue_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getIf_ElseKeyword_5ElementType());
              		
            }
            otherlv_5=(Token)match(input,42,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_5);
              		
            }
            // PsiInternalPaplj.g:1895:3: ( (lv_onFalse_6_0= ruleExpr ) )
            // PsiInternalPaplj.g:1896:4: (lv_onFalse_6_0= ruleExpr )
            {
            // PsiInternalPaplj.g:1896:4: (lv_onFalse_6_0= ruleExpr )
            // PsiInternalPaplj.g:1897:5: lv_onFalse_6_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getIf_OnFalseExprParserRuleCall_6_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_onFalse_6_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


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
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleLet"
    // PsiInternalPaplj.g:1914:1: entryRuleLet returns [Boolean current=false] : iv_ruleLet= ruleLet EOF ;
    public final Boolean entryRuleLet() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLet = null;


        try {
            // PsiInternalPaplj.g:1914:45: (iv_ruleLet= ruleLet EOF )
            // PsiInternalPaplj.g:1915:2: iv_ruleLet= ruleLet EOF
            {
            if ( state.backtracking==0 ) {
               markComposite(elementTypeProvider.getLetElementType()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLet=ruleLet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // PsiInternalPaplj.g:1921:1: ruleLet returns [Boolean current=false] : (otherlv_0= 'let' ( (lv_bindings_1_0= ruleBinding ) )* otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ) ;
    public final Boolean ruleLet() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Boolean lv_bindings_1_0 = null;

        Boolean lv_expr_3_0 = null;


        try {
            // PsiInternalPaplj.g:1922:1: ( (otherlv_0= 'let' ( (lv_bindings_1_0= ruleBinding ) )* otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ) )
            // PsiInternalPaplj.g:1923:2: (otherlv_0= 'let' ( (lv_bindings_1_0= ruleBinding ) )* otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) )
            {
            // PsiInternalPaplj.g:1923:2: (otherlv_0= 'let' ( (lv_bindings_1_0= ruleBinding ) )* otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) )
            // PsiInternalPaplj.g:1924:3: otherlv_0= 'let' ( (lv_bindings_1_0= ruleBinding ) )* otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) )
            {
            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getLet_LetKeyword_0ElementType());
              		
            }
            otherlv_0=(Token)match(input,43,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_0);
              		
            }
            // PsiInternalPaplj.g:1931:3: ( (lv_bindings_1_0= ruleBinding ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // PsiInternalPaplj.g:1932:4: (lv_bindings_1_0= ruleBinding )
            	    {
            	    // PsiInternalPaplj.g:1932:4: (lv_bindings_1_0= ruleBinding )
            	    // PsiInternalPaplj.g:1933:5: lv_bindings_1_0= ruleBinding
            	    {
            	    if ( state.backtracking==0 ) {

            	      					markComposite(elementTypeProvider.getLet_BindingsBindingParserRuleCall_1_0ElementType());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_bindings_1_0=ruleBinding();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					doneComposite();
            	      					if(!current) {
            	      						associateWithSemanticElement();
            	      						current = true;
            	      					}
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {

              			markLeaf(elementTypeProvider.getLet_InKeyword_2ElementType());
              		
            }
            otherlv_2=(Token)match(input,44,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			doneLeaf(otherlv_2);
              		
            }
            // PsiInternalPaplj.g:1953:3: ( (lv_expr_3_0= ruleExpr ) )
            // PsiInternalPaplj.g:1954:4: (lv_expr_3_0= ruleExpr )
            {
            // PsiInternalPaplj.g:1954:4: (lv_expr_3_0= ruleExpr )
            // PsiInternalPaplj.g:1955:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					markComposite(elementTypeProvider.getLet_ExprExprParserRuleCall_3_0ElementType());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					doneComposite();
              					if(!current) {
              						associateWithSemanticElement();
              						current = true;
              					}
              				
            }

            }


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
        return current;
    }
    // $ANTLR end "ruleLet"

    // $ANTLR start synpred1_PsiInternalPaplj
    public final void synpred1_PsiInternalPaplj_fragment() throws RecognitionException {   
        // PsiInternalPaplj.g:846:4: ( ( () '=' ( ( ruleExpr ) ) ) )
        // PsiInternalPaplj.g:846:5: ( () '=' ( ( ruleExpr ) ) )
        {
        // PsiInternalPaplj.g:846:5: ( () '=' ( ( ruleExpr ) ) )
        // PsiInternalPaplj.g:847:5: () '=' ( ( ruleExpr ) )
        {
        // PsiInternalPaplj.g:847:5: ()
        // PsiInternalPaplj.g:848:5: 
        {
        }

        match(input,24,FOLLOW_7); if (state.failed) return ;
        // PsiInternalPaplj.g:850:5: ( ( ruleExpr ) )
        // PsiInternalPaplj.g:851:6: ( ruleExpr )
        {
        // PsiInternalPaplj.g:851:6: ( ruleExpr )
        // PsiInternalPaplj.g:852:7: ruleExpr
        {
        pushFollow(FOLLOW_2);
        ruleExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_PsiInternalPaplj

    // $ANTLR start synpred2_PsiInternalPaplj
    public final void synpred2_PsiInternalPaplj_fragment() throws RecognitionException {   
        // PsiInternalPaplj.g:1384:4: ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )
        // PsiInternalPaplj.g:1384:5: ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? )
        {
        // PsiInternalPaplj.g:1384:5: ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? )
        // PsiInternalPaplj.g:1385:5: () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )?
        {
        // PsiInternalPaplj.g:1385:5: ()
        // PsiInternalPaplj.g:1386:5: 
        {
        }

        match(input,14,FOLLOW_3); if (state.failed) return ;
        // PsiInternalPaplj.g:1388:5: ( ( RULE_ID ) )
        // PsiInternalPaplj.g:1389:6: ( RULE_ID )
        {
        // PsiInternalPaplj.g:1389:6: ( RULE_ID )
        // PsiInternalPaplj.g:1390:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_32); if (state.failed) return ;

        }


        }

        // PsiInternalPaplj.g:1393:5: ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )?
        int alt43=2;
        int LA43_0 = input.LA(1);

        if ( (LA43_0==21) ) {
            alt43=1;
        }
        switch (alt43) {
            case 1 :
                // PsiInternalPaplj.g:1394:6: ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')'
                {
                // PsiInternalPaplj.g:1394:6: ( ( '(' ) )
                // PsiInternalPaplj.g:1395:7: ( '(' )
                {
                // PsiInternalPaplj.g:1395:7: ( '(' )
                // PsiInternalPaplj.g:1396:8: '('
                {
                match(input,21,FOLLOW_29); if (state.failed) return ;

                }


                }

                // PsiInternalPaplj.g:1399:6: ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_INT)||LA42_0==19||LA42_0==21||LA42_0==31||(LA42_0>=35 && LA42_0<=41)||LA42_0==43) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // PsiInternalPaplj.g:1400:7: ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )*
                        {
                        // PsiInternalPaplj.g:1400:7: ( ( ruleExpr ) )
                        // PsiInternalPaplj.g:1401:8: ( ruleExpr )
                        {
                        // PsiInternalPaplj.g:1401:8: ( ruleExpr )
                        // PsiInternalPaplj.g:1402:9: ruleExpr
                        {
                        pushFollow(FOLLOW_16);
                        ruleExpr();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }

                        // PsiInternalPaplj.g:1405:7: ( ',' ( ( ruleExpr ) ) )*
                        loop41:
                        do {
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==22) ) {
                                alt41=1;
                            }


                            switch (alt41) {
                        	case 1 :
                        	    // PsiInternalPaplj.g:1406:8: ',' ( ( ruleExpr ) )
                        	    {
                        	    match(input,22,FOLLOW_7); if (state.failed) return ;
                        	    // PsiInternalPaplj.g:1407:8: ( ( ruleExpr ) )
                        	    // PsiInternalPaplj.g:1408:9: ( ruleExpr )
                        	    {
                        	    // PsiInternalPaplj.g:1408:9: ( ruleExpr )
                        	    // PsiInternalPaplj.g:1409:10: ruleExpr
                        	    {
                        	    pushFollow(FOLLOW_16);
                        	    ruleExpr();

                        	    state._fsp--;
                        	    if (state.failed) return ;

                        	    }


                        	    }


                        	    }
                        	    break;

                        	default :
                        	    break loop41;
                            }
                        } while (true);


                        }
                        break;

                }

                match(input,23,FOLLOW_2); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred2_PsiInternalPaplj

    // Delegated rules

    public final boolean synpred1_PsiInternalPaplj() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_PsiInternalPaplj_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_PsiInternalPaplj() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_PsiInternalPaplj_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\3\uffff\1\5\3\uffff";
    static final String dfa_3s = "\5\4\2\uffff";
    static final String dfa_4s = "\1\4\1\16\1\4\1\25\1\16\2\uffff";
    static final String dfa_5s = "\5\uffff\1\1\1\2";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\3\11\uffff\1\2",
            "\1\4",
            "\1\5\7\uffff\1\5\7\uffff\1\5\1\6",
            "\1\3\11\uffff\1\2",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "367:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )";
        }
    }
    static final String dfa_8s = "\1\2\1\4\4\uffff\1\4";
    static final String dfa_9s = "\2\4\1\uffff\1\4\1\uffff\2\4";
    static final String dfa_10s = "\2\54\1\uffff\1\4\1\uffff\1\30\1\54";
    static final String dfa_11s = "\2\uffff\1\2\1\uffff\1\1\2\uffff";
    static final String[] dfa_12s = {
            "\1\1\7\uffff\1\2\1\uffff\1\2\5\uffff\1\2\1\uffff\15\2\7\uffff\1\2\1\uffff\1\2",
            "\1\5\7\uffff\1\4\1\uffff\1\3\5\uffff\1\4\1\uffff\15\4\7\uffff\1\4\1\uffff\1\4",
            "",
            "\1\6",
            "",
            "\1\4\11\uffff\1\4\11\uffff\1\2",
            "\1\5\7\uffff\1\4\1\uffff\1\3\5\uffff\17\4\7\uffff\1\4\1\uffff\1\4"
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1629:4: ( (otherlv_9= RULE_ID ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000033002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000032002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000BF880280030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000BF880381030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000038000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000204002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000BF880A80030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000010L});

}