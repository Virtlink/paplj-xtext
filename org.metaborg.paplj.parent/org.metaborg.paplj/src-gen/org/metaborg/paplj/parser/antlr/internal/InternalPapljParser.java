package org.metaborg.paplj.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.metaborg.paplj.services.PapljGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPapljParser extends AbstractInternalAntlrParser {
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


        public InternalPapljParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPapljParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPapljParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPaplj.g"; }



     	private PapljGrammarAccess grammarAccess;

        public InternalPapljParser(TokenStream input, PapljGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected PapljGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalPaplj.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalPaplj.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalPaplj.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProgramRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalPaplj.g:71:1: ruleProgram returns [EObject current=null] : ( (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleType ) )* (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )? ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_classes_4_0 = null;

        EObject lv_expr_6_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:77:2: ( ( (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleType ) )* (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )? ) )
            // InternalPaplj.g:78:2: ( (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleType ) )* (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )? )
            {
            // InternalPaplj.g:78:2: ( (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleType ) )* (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )? )
            // InternalPaplj.g:79:3: (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleImport ) )* ( (lv_classes_4_0= ruleType ) )* (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )?
            {
            // InternalPaplj.g:79:3: (otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPaplj.g:80:4: otherlv_0= 'program' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )?
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0_0());
                      			
                    }
                    // InternalPaplj.g:84:4: ( (lv_name_1_0= ruleQualifiedName ) )
                    // InternalPaplj.g:85:5: (lv_name_1_0= ruleQualifiedName )
                    {
                    // InternalPaplj.g:85:5: (lv_name_1_0= ruleQualifiedName )
                    // InternalPaplj.g:86:6: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProgramRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.metaborg.paplj.Paplj.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPaplj.g:103:4: (otherlv_2= ';' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==12) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalPaplj.g:104:5: otherlv_2= ';'
                            {
                            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getSemicolonKeyword_0_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalPaplj.g:110:3: ( (lv_imports_3_0= ruleImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPaplj.g:111:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalPaplj.g:111:4: (lv_imports_3_0= ruleImport )
            	    // InternalPaplj.g:112:5: lv_imports_3_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getImportsImportParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_3_0,
            	      						"org.metaborg.paplj.Paplj.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalPaplj.g:129:3: ( (lv_classes_4_0= ruleType ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPaplj.g:130:4: (lv_classes_4_0= ruleType )
            	    {
            	    // InternalPaplj.g:130:4: (lv_classes_4_0= ruleType )
            	    // InternalPaplj.g:131:5: lv_classes_4_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProgramAccess().getClassesTypeParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_classes_4_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProgramRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_4_0,
            	      						"org.metaborg.paplj.Paplj.Type");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalPaplj.g:148:3: (otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalPaplj.g:149:4: otherlv_5= 'run' ( (lv_expr_6_0= ruleExpr ) )
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getProgramAccess().getRunKeyword_3_0());
                      			
                    }
                    // InternalPaplj.g:153:4: ( (lv_expr_6_0= ruleExpr ) )
                    // InternalPaplj.g:154:5: (lv_expr_6_0= ruleExpr )
                    {
                    // InternalPaplj.g:154:5: (lv_expr_6_0= ruleExpr )
                    // InternalPaplj.g:155:6: lv_expr_6_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProgramAccess().getExprExprParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_6_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProgramRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_6_0,
                      							"org.metaborg.paplj.Paplj.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalPaplj.g:177:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalPaplj.g:177:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalPaplj.g:178:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalPaplj.g:184:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalPaplj.g:190:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalPaplj.g:191:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalPaplj.g:191:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalPaplj.g:192:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalPaplj.g:199:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPaplj.g:200:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalPaplj.g:217:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalPaplj.g:217:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalPaplj.g:218:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalPaplj.g:224:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:230:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalPaplj.g:231:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalPaplj.g:231:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalPaplj.g:232:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPaplj.g:242:3: (kw= '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPaplj.g:243:4: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImport"
    // InternalPaplj.g:253:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalPaplj.g:253:47: (iv_ruleImport= ruleImport EOF )
            // InternalPaplj.g:254:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalPaplj.g:260:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:266:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? ) )
            // InternalPaplj.g:267:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? )
            {
            // InternalPaplj.g:267:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )? )
            // InternalPaplj.g:268:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalPaplj.g:272:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalPaplj.g:273:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalPaplj.g:273:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalPaplj.g:274:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"org.metaborg.paplj.Paplj.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPaplj.g:291:3: (otherlv_2= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==12) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPaplj.g:292:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleType"
    // InternalPaplj.g:301:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalPaplj.g:301:45: (iv_ruleType= ruleType EOF )
            // InternalPaplj.g:302:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalPaplj.g:308:1: ruleType returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:314:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' ) )
            // InternalPaplj.g:315:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' )
            {
            // InternalPaplj.g:315:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}' )
            // InternalPaplj.g:316:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_members_5_0= ruleMember ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getClassKeyword_0());
              		
            }
            // InternalPaplj.g:320:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPaplj.g:321:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPaplj.g:321:4: (lv_name_1_0= RULE_ID )
            // InternalPaplj.g:322:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalPaplj.g:338:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPaplj.g:339:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalPaplj.g:343:4: ( ( ruleQualifiedName ) )
                    // InternalPaplj.g:344:5: ( ruleQualifiedName )
                    {
                    // InternalPaplj.g:344:5: ( ruleQualifiedName )
                    // InternalPaplj.g:345:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeAccess().getSuperTypeTypeCrossReference_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTypeAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalPaplj.g:364:3: ( (lv_members_5_0= ruleMember ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPaplj.g:365:4: (lv_members_5_0= ruleMember )
            	    {
            	    // InternalPaplj.g:365:4: (lv_members_5_0= ruleMember )
            	    // InternalPaplj.g:366:5: lv_members_5_0= ruleMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTypeAccess().getMembersMemberParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_members_5_0=ruleMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTypeRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_5_0,
            	      						"org.metaborg.paplj.Paplj.Member");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getTypeAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleMember"
    // InternalPaplj.g:391:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalPaplj.g:391:47: (iv_ruleMember= ruleMember EOF )
            // InternalPaplj.g:392:2: iv_ruleMember= ruleMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalPaplj.g:398:1: ruleMember returns [EObject current=null] : (this_Field_0= ruleField | this_Method_1= ruleMethod ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Field_0 = null;

        EObject this_Method_1 = null;



        	enterRule();

        try {
            // InternalPaplj.g:404:2: ( (this_Field_0= ruleField | this_Method_1= ruleMethod ) )
            // InternalPaplj.g:405:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            {
            // InternalPaplj.g:405:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalPaplj.g:406:3: this_Field_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getFieldParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Field_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Field_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPaplj.g:415:3: this_Method_1= ruleMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMemberAccess().getMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Method_1=ruleMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Method_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleField"
    // InternalPaplj.g:427:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalPaplj.g:427:46: (iv_ruleField= ruleField EOF )
            // InternalPaplj.g:428:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalPaplj.g:434:1: ruleField returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPaplj.g:440:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? ) )
            // InternalPaplj.g:441:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            {
            // InternalPaplj.g:441:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )? )
            // InternalPaplj.g:442:3: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' )?
            {
            // InternalPaplj.g:442:3: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:443:4: ( ruleQualifiedName )
            {
            // InternalPaplj.g:443:4: ( ruleQualifiedName )
            // InternalPaplj.g:444:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getTypeTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPaplj.g:458:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPaplj.g:459:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPaplj.g:459:4: (lv_name_1_0= RULE_ID )
            // InternalPaplj.g:460:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalPaplj.g:476:3: (otherlv_2= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPaplj.g:477:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMethod"
    // InternalPaplj.g:486:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalPaplj.g:486:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalPaplj.g:487:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalPaplj.g:493:1: ruleMethod returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock2 ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:499:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock2 ) ) ) )
            // InternalPaplj.g:500:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock2 ) ) )
            {
            // InternalPaplj.g:500:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock2 ) ) )
            // InternalPaplj.g:501:3: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock2 ) )
            {
            // InternalPaplj.g:501:3: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:502:4: ( ruleQualifiedName )
            {
            // InternalPaplj.g:502:4: ( ruleQualifiedName )
            // InternalPaplj.g:503:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getTypeTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPaplj.g:517:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPaplj.g:518:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPaplj.g:518:4: (lv_name_1_0= RULE_ID )
            // InternalPaplj.g:519:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMethodRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalPaplj.g:539:3: ( ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPaplj.g:540:4: ( (lv_params_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )*
                    {
                    // InternalPaplj.g:540:4: ( (lv_params_3_0= ruleParam ) )
                    // InternalPaplj.g:541:5: (lv_params_3_0= ruleParam )
                    {
                    // InternalPaplj.g:541:5: (lv_params_3_0= ruleParam )
                    // InternalPaplj.g:542:6: lv_params_3_0= ruleParam
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMethodAccess().getParamsParamParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_params_3_0=ruleParam();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMethodRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_3_0,
                      							"org.metaborg.paplj.Paplj.Param");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPaplj.g:559:4: (otherlv_4= ',' ( (lv_params_5_0= ruleParam ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==22) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalPaplj.g:560:5: otherlv_4= ',' ( (lv_params_5_0= ruleParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalPaplj.g:564:5: ( (lv_params_5_0= ruleParam ) )
                    	    // InternalPaplj.g:565:6: (lv_params_5_0= ruleParam )
                    	    {
                    	    // InternalPaplj.g:565:6: (lv_params_5_0= ruleParam )
                    	    // InternalPaplj.g:566:7: lv_params_5_0= ruleParam
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMethodAccess().getParamsParamParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_params_5_0=ruleParam();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_5_0,
                    	      								"org.metaborg.paplj.Paplj.Param");
                    	      							afterParserOrEnumRuleCall();
                    	      						
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

            otherlv_6=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalPaplj.g:589:3: ( (lv_body_7_0= ruleBlock2 ) )
            // InternalPaplj.g:590:4: (lv_body_7_0= ruleBlock2 )
            {
            // InternalPaplj.g:590:4: (lv_body_7_0= ruleBlock2 )
            // InternalPaplj.g:591:5: lv_body_7_0= ruleBlock2
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMethodAccess().getBodyBlock2ParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_7_0=ruleBlock2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMethodRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_7_0,
              						"org.metaborg.paplj.Paplj.Block2");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParam"
    // InternalPaplj.g:612:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalPaplj.g:612:46: (iv_ruleParam= ruleParam EOF )
            // InternalPaplj.g:613:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalPaplj.g:619:1: ruleParam returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalPaplj.g:625:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalPaplj.g:626:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalPaplj.g:626:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalPaplj.g:627:3: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalPaplj.g:627:3: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:628:4: ( ruleQualifiedName )
            {
            // InternalPaplj.g:628:4: ( ruleQualifiedName )
            // InternalPaplj.g:629:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParamRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParamAccess().getTypeTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPaplj.g:643:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPaplj.g:644:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPaplj.g:644:4: (lv_name_1_0= RULE_ID )
            // InternalPaplj.g:645:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getParamRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleBinding"
    // InternalPaplj.g:665:1: entryRuleBinding returns [EObject current=null] : iv_ruleBinding= ruleBinding EOF ;
    public final EObject entryRuleBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinding = null;


        try {
            // InternalPaplj.g:665:48: (iv_ruleBinding= ruleBinding EOF )
            // InternalPaplj.g:666:2: iv_ruleBinding= ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalPaplj.g:672:1: ruleBinding returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) ;
    public final EObject ruleBinding() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:678:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )
            // InternalPaplj.g:679:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) )
            {
            // InternalPaplj.g:679:2: ( ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) )
            // InternalPaplj.g:680:3: ( ( ruleQualifiedName ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) )
            {
            // InternalPaplj.g:680:3: ( ( ruleQualifiedName ) )
            // InternalPaplj.g:681:4: ( ruleQualifiedName )
            {
            // InternalPaplj.g:681:4: ( ruleQualifiedName )
            // InternalPaplj.g:682:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getTypeTypeCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalPaplj.g:696:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPaplj.g:697:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPaplj.g:697:4: (lv_name_1_0= RULE_ID )
            // InternalPaplj.g:698:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getBindingAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBindingAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalPaplj.g:718:3: ( (lv_value_3_0= ruleExpr ) )
            // InternalPaplj.g:719:4: (lv_value_3_0= ruleExpr )
            {
            // InternalPaplj.g:719:4: (lv_value_3_0= ruleExpr )
            // InternalPaplj.g:720:5: lv_value_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBindingAccess().getValueExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBindingRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"org.metaborg.paplj.Paplj.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleBlock2"
    // InternalPaplj.g:741:1: entryRuleBlock2 returns [EObject current=null] : iv_ruleBlock2= ruleBlock2 EOF ;
    public final EObject entryRuleBlock2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock2 = null;


        try {
            // InternalPaplj.g:741:47: (iv_ruleBlock2= ruleBlock2 EOF )
            // InternalPaplj.g:742:2: iv_ruleBlock2= ruleBlock2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlock2Rule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock2"


    // $ANTLR start "ruleBlock2"
    // InternalPaplj.g:748:1: ruleBlock2 returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )? (otherlv_5= ';' )? otherlv_6= '}' ) ;
    public final EObject ruleBlock2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:754:2: ( ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )? (otherlv_5= ';' )? otherlv_6= '}' ) )
            // InternalPaplj.g:755:2: ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )? (otherlv_5= ';' )? otherlv_6= '}' )
            {
            // InternalPaplj.g:755:2: ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )? (otherlv_5= ';' )? otherlv_6= '}' )
            // InternalPaplj.g:756:3: () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )? (otherlv_5= ';' )? otherlv_6= '}'
            {
            // InternalPaplj.g:756:3: ()
            // InternalPaplj.g:757:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlock2Access().getBlock2Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBlock2Access().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalPaplj.g:767:3: ( ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||LA16_0==19||LA16_0==21||LA16_0==31||(LA16_0>=35 && LA16_0<=41)||LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPaplj.g:768:4: ( (lv_exprs_2_0= ruleExpr ) ) (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )*
                    {
                    // InternalPaplj.g:768:4: ( (lv_exprs_2_0= ruleExpr ) )
                    // InternalPaplj.g:769:5: (lv_exprs_2_0= ruleExpr )
                    {
                    // InternalPaplj.g:769:5: (lv_exprs_2_0= ruleExpr )
                    // InternalPaplj.g:770:6: lv_exprs_2_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlock2Access().getExprsExprParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_exprs_2_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBlock2Rule());
                      						}
                      						add(
                      							current,
                      							"exprs",
                      							lv_exprs_2_0,
                      							"org.metaborg.paplj.Paplj.Expr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalPaplj.g:787:4: (otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) ) )*
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
                    	    // InternalPaplj.g:788:5: otherlv_3= ';' ( (lv_exprs_4_0= ruleExpr ) )
                    	    {
                    	    otherlv_3=(Token)match(input,12,FOLLOW_7); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getBlock2Access().getSemicolonKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalPaplj.g:792:5: ( (lv_exprs_4_0= ruleExpr ) )
                    	    // InternalPaplj.g:793:6: (lv_exprs_4_0= ruleExpr )
                    	    {
                    	    // InternalPaplj.g:793:6: (lv_exprs_4_0= ruleExpr )
                    	    // InternalPaplj.g:794:7: lv_exprs_4_0= ruleExpr
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBlock2Access().getExprsExprParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_19);
                    	    lv_exprs_4_0=ruleExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBlock2Rule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exprs",
                    	      								lv_exprs_4_0,
                    	      								"org.metaborg.paplj.Paplj.Expr");
                    	      							afterParserOrEnumRuleCall();
                    	      						
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

            // InternalPaplj.g:813:3: (otherlv_5= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPaplj.g:814:4: otherlv_5= ';'
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getBlock2Access().getSemicolonKeyword_3());
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBlock2Access().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock2"


    // $ANTLR start "entryRuleExpr"
    // InternalPaplj.g:827:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalPaplj.g:827:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalPaplj.g:828:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalPaplj.g:834:1: ruleExpr returns [EObject current=null] : this_IfLetExpr_0= ruleIfLetExpr ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_IfLetExpr_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:840:2: (this_IfLetExpr_0= ruleIfLetExpr )
            // InternalPaplj.g:841:2: this_IfLetExpr_0= ruleIfLetExpr
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExprAccess().getIfLetExprParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_IfLetExpr_0=ruleIfLetExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_IfLetExpr_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleIfLetExpr"
    // InternalPaplj.g:852:1: entryRuleIfLetExpr returns [EObject current=null] : iv_ruleIfLetExpr= ruleIfLetExpr EOF ;
    public final EObject entryRuleIfLetExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfLetExpr = null;


        try {
            // InternalPaplj.g:852:50: (iv_ruleIfLetExpr= ruleIfLetExpr EOF )
            // InternalPaplj.g:853:2: iv_ruleIfLetExpr= ruleIfLetExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfLetExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfLetExpr"


    // $ANTLR start "ruleIfLetExpr"
    // InternalPaplj.g:859:1: ruleIfLetExpr returns [EObject current=null] : (this_If_0= ruleIf | this_Let_1= ruleLet | this_AssignmentExpr_2= ruleAssignmentExpr ) ;
    public final EObject ruleIfLetExpr() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_Let_1 = null;

        EObject this_AssignmentExpr_2 = null;



        	enterRule();

        try {
            // InternalPaplj.g:865:2: ( (this_If_0= ruleIf | this_Let_1= ruleLet | this_AssignmentExpr_2= ruleAssignmentExpr ) )
            // InternalPaplj.g:866:2: (this_If_0= ruleIf | this_Let_1= ruleLet | this_AssignmentExpr_2= ruleAssignmentExpr )
            {
            // InternalPaplj.g:866:2: (this_If_0= ruleIf | this_Let_1= ruleLet | this_AssignmentExpr_2= ruleAssignmentExpr )
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
                    // InternalPaplj.g:867:3: this_If_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIfLetExprAccess().getIfParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_If_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_If_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalPaplj.g:876:3: this_Let_1= ruleLet
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIfLetExprAccess().getLetParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Let_1=ruleLet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Let_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalPaplj.g:885:3: this_AssignmentExpr_2= ruleAssignmentExpr
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getIfLetExprAccess().getAssignmentExprParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AssignmentExpr_2=ruleAssignmentExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AssignmentExpr_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfLetExpr"


    // $ANTLR start "entryRuleAssignmentExpr"
    // InternalPaplj.g:897:1: entryRuleAssignmentExpr returns [EObject current=null] : iv_ruleAssignmentExpr= ruleAssignmentExpr EOF ;
    public final EObject entryRuleAssignmentExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentExpr = null;


        try {
            // InternalPaplj.g:897:55: (iv_ruleAssignmentExpr= ruleAssignmentExpr EOF )
            // InternalPaplj.g:898:2: iv_ruleAssignmentExpr= ruleAssignmentExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentExpr"


    // $ANTLR start "ruleAssignmentExpr"
    // InternalPaplj.g:904:1: ruleAssignmentExpr returns [EObject current=null] : (this_LogicalOrExpr_0= ruleLogicalOrExpr ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )? ) ;
    public final EObject ruleAssignmentExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalOrExpr_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:910:2: ( (this_LogicalOrExpr_0= ruleLogicalOrExpr ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )? ) )
            // InternalPaplj.g:911:2: (this_LogicalOrExpr_0= ruleLogicalOrExpr ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )? )
            {
            // InternalPaplj.g:911:2: (this_LogicalOrExpr_0= ruleLogicalOrExpr ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )? )
            // InternalPaplj.g:912:3: this_LogicalOrExpr_0= ruleLogicalOrExpr ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignmentExprAccess().getLogicalOrExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_LogicalOrExpr_0=ruleLogicalOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalOrExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPaplj.g:920:3: ( ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) && (synpred1_InternalPaplj())) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPaplj.g:921:4: ( ( () '=' ( ( ruleExpr ) ) ) )=> ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) )
                    {
                    // InternalPaplj.g:932:4: ( () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) ) )
                    // InternalPaplj.g:933:5: () otherlv_2= '=' ( (lv_value_3_0= ruleExpr ) )
                    {
                    // InternalPaplj.g:933:5: ()
                    // InternalPaplj.g:934:6: 
                    {
                    if ( state.backtracking==0 ) {

                      						current = forceCreateModelElementAndSet(
                      							grammarAccess.getAssignmentExprAccess().getAssignmentLeftAction_1_0_0(),
                      							current);
                      					
                    }

                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getAssignmentExprAccess().getEqualsSignKeyword_1_0_1());
                      				
                    }
                    // InternalPaplj.g:944:5: ( (lv_value_3_0= ruleExpr ) )
                    // InternalPaplj.g:945:6: (lv_value_3_0= ruleExpr )
                    {
                    // InternalPaplj.g:945:6: (lv_value_3_0= ruleExpr )
                    // InternalPaplj.g:946:7: lv_value_3_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getAssignmentExprAccess().getValueExprParserRuleCall_1_0_2_0());
                      						
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getAssignmentExprRule());
                      							}
                      							set(
                      								current,
                      								"value",
                      								lv_value_3_0,
                      								"org.metaborg.paplj.Paplj.Expr");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentExpr"


    // $ANTLR start "entryRuleLogicalOrExpr"
    // InternalPaplj.g:969:1: entryRuleLogicalOrExpr returns [EObject current=null] : iv_ruleLogicalOrExpr= ruleLogicalOrExpr EOF ;
    public final EObject entryRuleLogicalOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpr = null;


        try {
            // InternalPaplj.g:969:54: (iv_ruleLogicalOrExpr= ruleLogicalOrExpr EOF )
            // InternalPaplj.g:970:2: iv_ruleLogicalOrExpr= ruleLogicalOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOrExpr"


    // $ANTLR start "ruleLogicalOrExpr"
    // InternalPaplj.g:976:1: ruleLogicalOrExpr returns [EObject current=null] : (this_LogicalAndExpr_0= ruleLogicalAndExpr ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )* ) ;
    public final EObject ruleLogicalOrExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_LogicalAndExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:982:2: ( (this_LogicalAndExpr_0= ruleLogicalAndExpr ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )* ) )
            // InternalPaplj.g:983:2: (this_LogicalAndExpr_0= ruleLogicalAndExpr ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )* )
            {
            // InternalPaplj.g:983:2: (this_LogicalAndExpr_0= ruleLogicalAndExpr ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )* )
            // InternalPaplj.g:984:3: this_LogicalAndExpr_0= ruleLogicalAndExpr ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalOrExprAccess().getLogicalAndExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_LogicalAndExpr_0=ruleLogicalAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_LogicalAndExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPaplj.g:992:3: ( ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==25) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPaplj.g:993:4: ( () otherlv_2= '||' ) ( (lv_right_3_0= ruleLogicalAndExpr ) )
            	    {
            	    // InternalPaplj.g:993:4: ( () otherlv_2= '||' )
            	    // InternalPaplj.g:994:5: () otherlv_2= '||'
            	    {
            	    // InternalPaplj.g:994:5: ()
            	    // InternalPaplj.g:995:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getLogicalOrExprAccess().getOrLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getLogicalOrExprAccess().getVerticalLineVerticalLineKeyword_1_0_1());
            	      				
            	    }

            	    }

            	    // InternalPaplj.g:1006:4: ( (lv_right_3_0= ruleLogicalAndExpr ) )
            	    // InternalPaplj.g:1007:5: (lv_right_3_0= ruleLogicalAndExpr )
            	    {
            	    // InternalPaplj.g:1007:5: (lv_right_3_0= ruleLogicalAndExpr )
            	    // InternalPaplj.g:1008:6: lv_right_3_0= ruleLogicalAndExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalOrExprAccess().getRightLogicalAndExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleLogicalAndExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalOrExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.metaborg.paplj.Paplj.LogicalAndExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOrExpr"


    // $ANTLR start "entryRuleLogicalAndExpr"
    // InternalPaplj.g:1030:1: entryRuleLogicalAndExpr returns [EObject current=null] : iv_ruleLogicalAndExpr= ruleLogicalAndExpr EOF ;
    public final EObject entryRuleLogicalAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpr = null;


        try {
            // InternalPaplj.g:1030:55: (iv_ruleLogicalAndExpr= ruleLogicalAndExpr EOF )
            // InternalPaplj.g:1031:2: iv_ruleLogicalAndExpr= ruleLogicalAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalAndExpr"


    // $ANTLR start "ruleLogicalAndExpr"
    // InternalPaplj.g:1037:1: ruleLogicalAndExpr returns [EObject current=null] : (this_ComparativeExpr_0= ruleComparativeExpr ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )* ) ;
    public final EObject ruleLogicalAndExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ComparativeExpr_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:1043:2: ( (this_ComparativeExpr_0= ruleComparativeExpr ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )* ) )
            // InternalPaplj.g:1044:2: (this_ComparativeExpr_0= ruleComparativeExpr ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )* )
            {
            // InternalPaplj.g:1044:2: (this_ComparativeExpr_0= ruleComparativeExpr ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )* )
            // InternalPaplj.g:1045:3: this_ComparativeExpr_0= ruleComparativeExpr ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLogicalAndExprAccess().getComparativeExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_ComparativeExpr_0=ruleComparativeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ComparativeExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPaplj.g:1053:3: ( ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPaplj.g:1054:4: ( () otherlv_2= '&&' ) ( (lv_right_3_0= ruleComparativeExpr ) )
            	    {
            	    // InternalPaplj.g:1054:4: ( () otherlv_2= '&&' )
            	    // InternalPaplj.g:1055:5: () otherlv_2= '&&'
            	    {
            	    // InternalPaplj.g:1055:5: ()
            	    // InternalPaplj.g:1056:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getLogicalAndExprAccess().getAndLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getLogicalAndExprAccess().getAmpersandAmpersandKeyword_1_0_1());
            	      				
            	    }

            	    }

            	    // InternalPaplj.g:1067:4: ( (lv_right_3_0= ruleComparativeExpr ) )
            	    // InternalPaplj.g:1068:5: (lv_right_3_0= ruleComparativeExpr )
            	    {
            	    // InternalPaplj.g:1068:5: (lv_right_3_0= ruleComparativeExpr )
            	    // InternalPaplj.g:1069:6: lv_right_3_0= ruleComparativeExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLogicalAndExprAccess().getRightComparativeExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleComparativeExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getLogicalAndExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.metaborg.paplj.Paplj.ComparativeExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalAndExpr"


    // $ANTLR start "entryRuleComparativeExpr"
    // InternalPaplj.g:1091:1: entryRuleComparativeExpr returns [EObject current=null] : iv_ruleComparativeExpr= ruleComparativeExpr EOF ;
    public final EObject entryRuleComparativeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparativeExpr = null;


        try {
            // InternalPaplj.g:1091:56: (iv_ruleComparativeExpr= ruleComparativeExpr EOF )
            // InternalPaplj.g:1092:2: iv_ruleComparativeExpr= ruleComparativeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparativeExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparativeExpr"


    // $ANTLR start "ruleComparativeExpr"
    // InternalPaplj.g:1098:1: ruleComparativeExpr returns [EObject current=null] : (this_AdditiveExpr_0= ruleAdditiveExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )? ) ;
    public final EObject ruleComparativeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_AdditiveExpr_0 = null;

        EObject lv_right_7_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:1104:2: ( (this_AdditiveExpr_0= ruleAdditiveExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )? ) )
            // InternalPaplj.g:1105:2: (this_AdditiveExpr_0= ruleAdditiveExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )? )
            {
            // InternalPaplj.g:1105:2: (this_AdditiveExpr_0= ruleAdditiveExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )? )
            // InternalPaplj.g:1106:3: this_AdditiveExpr_0= ruleAdditiveExpr ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparativeExprAccess().getAdditiveExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_AdditiveExpr_0=ruleAdditiveExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AdditiveExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPaplj.g:1114:3: ( ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=27 && LA23_0<=29)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalPaplj.g:1115:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) ) ( (lv_right_7_0= ruleAdditiveExpr ) )
                    {
                    // InternalPaplj.g:1115:4: ( ( () otherlv_2= '==' ) | ( () otherlv_4= '!=' ) | ( () otherlv_6= '<' ) )
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
                            // InternalPaplj.g:1116:5: ( () otherlv_2= '==' )
                            {
                            // InternalPaplj.g:1116:5: ( () otherlv_2= '==' )
                            // InternalPaplj.g:1117:6: () otherlv_2= '=='
                            {
                            // InternalPaplj.g:1117:6: ()
                            // InternalPaplj.g:1118:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndSet(
                              								grammarAccess.getComparativeExprAccess().getEqLeftAction_1_0_0_0(),
                              								current);
                              						
                            }

                            }

                            otherlv_2=(Token)match(input,27,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getComparativeExprAccess().getEqualsSignEqualsSignKeyword_1_0_0_1());
                              					
                            }

                            }


                            }
                            break;
                        case 2 :
                            // InternalPaplj.g:1130:5: ( () otherlv_4= '!=' )
                            {
                            // InternalPaplj.g:1130:5: ( () otherlv_4= '!=' )
                            // InternalPaplj.g:1131:6: () otherlv_4= '!='
                            {
                            // InternalPaplj.g:1131:6: ()
                            // InternalPaplj.g:1132:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndSet(
                              								grammarAccess.getComparativeExprAccess().getNeqLeftAction_1_0_1_0(),
                              								current);
                              						
                            }

                            }

                            otherlv_4=(Token)match(input,28,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getComparativeExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1_1());
                              					
                            }

                            }


                            }
                            break;
                        case 3 :
                            // InternalPaplj.g:1144:5: ( () otherlv_6= '<' )
                            {
                            // InternalPaplj.g:1144:5: ( () otherlv_6= '<' )
                            // InternalPaplj.g:1145:6: () otherlv_6= '<'
                            {
                            // InternalPaplj.g:1145:6: ()
                            // InternalPaplj.g:1146:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndSet(
                              								grammarAccess.getComparativeExprAccess().getLtLeftAction_1_0_2_0(),
                              								current);
                              						
                            }

                            }

                            otherlv_6=(Token)match(input,29,FOLLOW_7); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_6, grammarAccess.getComparativeExprAccess().getLessThanSignKeyword_1_0_2_1());
                              					
                            }

                            }


                            }
                            break;

                    }

                    // InternalPaplj.g:1158:4: ( (lv_right_7_0= ruleAdditiveExpr ) )
                    // InternalPaplj.g:1159:5: (lv_right_7_0= ruleAdditiveExpr )
                    {
                    // InternalPaplj.g:1159:5: (lv_right_7_0= ruleAdditiveExpr )
                    // InternalPaplj.g:1160:6: lv_right_7_0= ruleAdditiveExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getComparativeExprAccess().getRightAdditiveExprParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_7_0=ruleAdditiveExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getComparativeExprRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_7_0,
                      							"org.metaborg.paplj.Paplj.AdditiveExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparativeExpr"


    // $ANTLR start "entryRuleAdditiveExpr"
    // InternalPaplj.g:1182:1: entryRuleAdditiveExpr returns [EObject current=null] : iv_ruleAdditiveExpr= ruleAdditiveExpr EOF ;
    public final EObject entryRuleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpr = null;


        try {
            // InternalPaplj.g:1182:53: (iv_ruleAdditiveExpr= ruleAdditiveExpr EOF )
            // InternalPaplj.g:1183:2: iv_ruleAdditiveExpr= ruleAdditiveExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpr"


    // $ANTLR start "ruleAdditiveExpr"
    // InternalPaplj.g:1189:1: ruleAdditiveExpr returns [EObject current=null] : (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* ) ;
    public final EObject ruleAdditiveExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MultiplicativeExpr_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:1195:2: ( (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* ) )
            // InternalPaplj.g:1196:2: (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* )
            {
            // InternalPaplj.g:1196:2: (this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )* )
            // InternalPaplj.g:1197:3: this_MultiplicativeExpr_0= ruleMultiplicativeExpr ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAdditiveExprAccess().getMultiplicativeExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_MultiplicativeExpr_0=ruleMultiplicativeExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MultiplicativeExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPaplj.g:1205:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=30 && LA25_0<=31)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPaplj.g:1206:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplicativeExpr ) )
            	    {
            	    // InternalPaplj.g:1206:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
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
            	            // InternalPaplj.g:1207:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalPaplj.g:1207:5: ( () otherlv_2= '+' )
            	            // InternalPaplj.g:1208:6: () otherlv_2= '+'
            	            {
            	            // InternalPaplj.g:1208:6: ()
            	            // InternalPaplj.g:1209:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAdditiveExprAccess().getAddLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,30,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getAdditiveExprAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPaplj.g:1221:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalPaplj.g:1221:5: ( () otherlv_4= '-' )
            	            // InternalPaplj.g:1222:6: () otherlv_4= '-'
            	            {
            	            // InternalPaplj.g:1222:6: ()
            	            // InternalPaplj.g:1223:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getAdditiveExprAccess().getSubLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getAdditiveExprAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalPaplj.g:1235:4: ( (lv_right_5_0= ruleMultiplicativeExpr ) )
            	    // InternalPaplj.g:1236:5: (lv_right_5_0= ruleMultiplicativeExpr )
            	    {
            	    // InternalPaplj.g:1236:5: (lv_right_5_0= ruleMultiplicativeExpr )
            	    // InternalPaplj.g:1237:6: lv_right_5_0= ruleMultiplicativeExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAdditiveExprAccess().getRightMultiplicativeExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_right_5_0=ruleMultiplicativeExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAdditiveExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.metaborg.paplj.Paplj.MultiplicativeExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpr"


    // $ANTLR start "entryRuleMultiplicativeExpr"
    // InternalPaplj.g:1259:1: entryRuleMultiplicativeExpr returns [EObject current=null] : iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF ;
    public final EObject entryRuleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpr = null;


        try {
            // InternalPaplj.g:1259:59: (iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF )
            // InternalPaplj.g:1260:2: iv_ruleMultiplicativeExpr= ruleMultiplicativeExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpr"


    // $ANTLR start "ruleMultiplicativeExpr"
    // InternalPaplj.g:1266:1: ruleMultiplicativeExpr returns [EObject current=null] : (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* ) ;
    public final EObject ruleMultiplicativeExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_UnaryExpr_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:1272:2: ( (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* ) )
            // InternalPaplj.g:1273:2: (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* )
            {
            // InternalPaplj.g:1273:2: (this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )* )
            // InternalPaplj.g:1274:3: this_UnaryExpr_0= ruleUnaryExpr ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getUnaryExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_UnaryExpr_0=ruleUnaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_UnaryExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPaplj.g:1282:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=32 && LA27_0<=33)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPaplj.g:1283:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= ruleUnaryExpr ) )
            	    {
            	    // InternalPaplj.g:1283:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
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
            	            // InternalPaplj.g:1284:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalPaplj.g:1284:5: ( () otherlv_2= '*' )
            	            // InternalPaplj.g:1285:6: () otherlv_2= '*'
            	            {
            	            // InternalPaplj.g:1285:6: ()
            	            // InternalPaplj.g:1286:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMultiplicativeExprAccess().getMulLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,32,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getMultiplicativeExprAccess().getAsteriskKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalPaplj.g:1298:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalPaplj.g:1298:5: ( () otherlv_4= '/' )
            	            // InternalPaplj.g:1299:6: () otherlv_4= '/'
            	            {
            	            // InternalPaplj.g:1299:6: ()
            	            // InternalPaplj.g:1300:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMultiplicativeExprAccess().getDivLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,33,FOLLOW_7); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getMultiplicativeExprAccess().getSolidusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalPaplj.g:1312:4: ( (lv_right_5_0= ruleUnaryExpr ) )
            	    // InternalPaplj.g:1313:5: (lv_right_5_0= ruleUnaryExpr )
            	    {
            	    // InternalPaplj.g:1313:5: (lv_right_5_0= ruleUnaryExpr )
            	    // InternalPaplj.g:1314:6: lv_right_5_0= ruleUnaryExpr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMultiplicativeExprAccess().getRightUnaryExprParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_right_5_0=ruleUnaryExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMultiplicativeExprRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.metaborg.paplj.Paplj.UnaryExpr");
            	      						afterParserOrEnumRuleCall();
            	      					
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpr"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalPaplj.g:1336:1: entryRuleUnaryExpr returns [EObject current=null] : iv_ruleUnaryExpr= ruleUnaryExpr EOF ;
    public final EObject entryRuleUnaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpr = null;


        try {
            // InternalPaplj.g:1336:50: (iv_ruleUnaryExpr= ruleUnaryExpr EOF )
            // InternalPaplj.g:1337:2: iv_ruleUnaryExpr= ruleUnaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalPaplj.g:1343:1: ruleUnaryExpr returns [EObject current=null] : ( (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? ) | ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) ) | ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) ) ) ;
    public final EObject ruleUnaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject this_MemberExpr_0 = null;

        EObject lv_expr_6_0 = null;

        EObject lv_expr_9_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:1349:2: ( ( (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? ) | ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) ) | ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) ) ) )
            // InternalPaplj.g:1350:2: ( (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? ) | ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) ) | ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) ) )
            {
            // InternalPaplj.g:1350:2: ( (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? ) | ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) ) | ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) ) )
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
                    // InternalPaplj.g:1351:3: (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? )
                    {
                    // InternalPaplj.g:1351:3: (this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )? )
                    // InternalPaplj.g:1352:4: this_MemberExpr_0= ruleMemberExpr ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getUnaryExprAccess().getMemberExprParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_27);
                    this_MemberExpr_0=ruleMemberExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_MemberExpr_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalPaplj.g:1360:4: ( ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==34) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalPaplj.g:1361:5: ( () otherlv_2= 'as' ) ( (otherlv_3= RULE_ID ) )
                            {
                            // InternalPaplj.g:1361:5: ( () otherlv_2= 'as' )
                            // InternalPaplj.g:1362:6: () otherlv_2= 'as'
                            {
                            // InternalPaplj.g:1362:6: ()
                            // InternalPaplj.g:1363:7: 
                            {
                            if ( state.backtracking==0 ) {

                              							current = forceCreateModelElementAndSet(
                              								grammarAccess.getUnaryExprAccess().getCastLeftAction_0_1_0_0(),
                              								current);
                              						
                            }

                            }

                            otherlv_2=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_2, grammarAccess.getUnaryExprAccess().getAsKeyword_0_1_0_1());
                              					
                            }

                            }

                            // InternalPaplj.g:1374:5: ( (otherlv_3= RULE_ID ) )
                            // InternalPaplj.g:1375:6: (otherlv_3= RULE_ID )
                            {
                            // InternalPaplj.g:1375:6: (otherlv_3= RULE_ID )
                            // InternalPaplj.g:1376:7: otherlv_3= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getUnaryExprRule());
                              							}
                              						
                            }
                            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_3, grammarAccess.getUnaryExprAccess().getTypeTypeCrossReference_0_1_1_0());
                              						
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
                    // InternalPaplj.g:1390:3: ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) )
                    {
                    // InternalPaplj.g:1390:3: ( () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) ) )
                    // InternalPaplj.g:1391:4: () otherlv_5= '!' ( (lv_expr_6_0= ruleUnaryExpr ) )
                    {
                    // InternalPaplj.g:1391:4: ()
                    // InternalPaplj.g:1392:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExprAccess().getNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,35,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getUnaryExprAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalPaplj.g:1402:4: ( (lv_expr_6_0= ruleUnaryExpr ) )
                    // InternalPaplj.g:1403:5: (lv_expr_6_0= ruleUnaryExpr )
                    {
                    // InternalPaplj.g:1403:5: (lv_expr_6_0= ruleUnaryExpr )
                    // InternalPaplj.g:1404:6: lv_expr_6_0= ruleUnaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_6_0=ruleUnaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_6_0,
                      							"org.metaborg.paplj.Paplj.UnaryExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPaplj.g:1423:3: ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) )
                    {
                    // InternalPaplj.g:1423:3: ( () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) ) )
                    // InternalPaplj.g:1424:4: () otherlv_8= '-' ( (lv_expr_9_0= ruleUnaryExpr ) )
                    {
                    // InternalPaplj.g:1424:4: ()
                    // InternalPaplj.g:1425:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getUnaryExprAccess().getMinAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,31,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getUnaryExprAccess().getHyphenMinusKeyword_2_1());
                      			
                    }
                    // InternalPaplj.g:1435:4: ( (lv_expr_9_0= ruleUnaryExpr ) )
                    // InternalPaplj.g:1436:5: (lv_expr_9_0= ruleUnaryExpr )
                    {
                    // InternalPaplj.g:1436:5: (lv_expr_9_0= ruleUnaryExpr )
                    // InternalPaplj.g:1437:6: lv_expr_9_0= ruleUnaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getUnaryExprAccess().getExprUnaryExprParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_9_0=ruleUnaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getUnaryExprRule());
                      						}
                      						set(
                      							current,
                      							"expr",
                      							lv_expr_9_0,
                      							"org.metaborg.paplj.Paplj.UnaryExpr");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRuleMemberExpr"
    // InternalPaplj.g:1459:1: entryRuleMemberExpr returns [EObject current=null] : iv_ruleMemberExpr= ruleMemberExpr EOF ;
    public final EObject entryRuleMemberExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberExpr = null;


        try {
            // InternalPaplj.g:1459:51: (iv_ruleMemberExpr= ruleMemberExpr EOF )
            // InternalPaplj.g:1460:2: iv_ruleMemberExpr= ruleMemberExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberExpr"


    // $ANTLR start "ruleMemberExpr"
    // InternalPaplj.g:1466:1: ruleMemberExpr returns [EObject current=null] : (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )* ) ;
    public final EObject ruleMemberExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_methodInvocation_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_PrimaryExpr_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:1472:2: ( (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )* ) )
            // InternalPaplj.g:1473:2: (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )* )
            {
            // InternalPaplj.g:1473:2: (this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )* )
            // InternalPaplj.g:1474:3: this_PrimaryExpr_0= rulePrimaryExpr ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMemberExprAccess().getPrimaryExprParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_PrimaryExpr_0=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PrimaryExpr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalPaplj.g:1482:3: ( ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==14) && (synpred2_InternalPaplj())) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPaplj.g:1483:4: ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? )
            	    {
            	    // InternalPaplj.g:1517:4: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )? )
            	    // InternalPaplj.g:1518:5: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // InternalPaplj.g:1518:5: ()
            	    // InternalPaplj.g:1519:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getMemberExprAccess().getMemberRefLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getMemberExprAccess().getFullStopKeyword_1_0_1());
            	      				
            	    }
            	    // InternalPaplj.g:1529:5: ( (otherlv_3= RULE_ID ) )
            	    // InternalPaplj.g:1530:6: (otherlv_3= RULE_ID )
            	    {
            	    // InternalPaplj.g:1530:6: (otherlv_3= RULE_ID )
            	    // InternalPaplj.g:1531:7: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getMemberExprRule());
            	      							}
            	      						
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_3, grammarAccess.getMemberExprAccess().getMemberMemberCrossReference_1_0_2_0());
            	      						
            	    }

            	    }


            	    }

            	    // InternalPaplj.g:1542:5: ( ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==21) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalPaplj.g:1543:6: ( (lv_methodInvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )? otherlv_8= ')'
            	            {
            	            // InternalPaplj.g:1543:6: ( (lv_methodInvocation_4_0= '(' ) )
            	            // InternalPaplj.g:1544:7: (lv_methodInvocation_4_0= '(' )
            	            {
            	            // InternalPaplj.g:1544:7: (lv_methodInvocation_4_0= '(' )
            	            // InternalPaplj.g:1545:8: lv_methodInvocation_4_0= '('
            	            {
            	            lv_methodInvocation_4_0=(Token)match(input,21,FOLLOW_29); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_methodInvocation_4_0, grammarAccess.getMemberExprAccess().getMethodInvocationLeftParenthesisKeyword_1_0_3_0_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMemberExprRule());
            	              								}
            	              								setWithLastConsumed(current, "methodInvocation", true, "(");
            	              							
            	            }

            	            }


            	            }

            	            // InternalPaplj.g:1557:6: ( ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )* )?
            	            int alt31=2;
            	            int LA31_0 = input.LA(1);

            	            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||LA31_0==19||LA31_0==21||LA31_0==31||(LA31_0>=35 && LA31_0<=41)||LA31_0==43) ) {
            	                alt31=1;
            	            }
            	            switch (alt31) {
            	                case 1 :
            	                    // InternalPaplj.g:1558:7: ( (lv_args_5_0= ruleExpr ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )*
            	                    {
            	                    // InternalPaplj.g:1558:7: ( (lv_args_5_0= ruleExpr ) )
            	                    // InternalPaplj.g:1559:8: (lv_args_5_0= ruleExpr )
            	                    {
            	                    // InternalPaplj.g:1559:8: (lv_args_5_0= ruleExpr )
            	                    // InternalPaplj.g:1560:9: lv_args_5_0= ruleExpr
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      									newCompositeNode(grammarAccess.getMemberExprAccess().getArgsExprParserRuleCall_1_0_3_1_0_0());
            	                      								
            	                    }
            	                    pushFollow(FOLLOW_16);
            	                    lv_args_5_0=ruleExpr();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      									if (current==null) {
            	                      										current = createModelElementForParent(grammarAccess.getMemberExprRule());
            	                      									}
            	                      									add(
            	                      										current,
            	                      										"args",
            	                      										lv_args_5_0,
            	                      										"org.metaborg.paplj.Paplj.Expr");
            	                      									afterParserOrEnumRuleCall();
            	                      								
            	                    }

            	                    }


            	                    }

            	                    // InternalPaplj.g:1577:7: (otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) ) )*
            	                    loop30:
            	                    do {
            	                        int alt30=2;
            	                        int LA30_0 = input.LA(1);

            	                        if ( (LA30_0==22) ) {
            	                            alt30=1;
            	                        }


            	                        switch (alt30) {
            	                    	case 1 :
            	                    	    // InternalPaplj.g:1578:8: otherlv_6= ',' ( (lv_args_7_0= ruleExpr ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      								newLeafNode(otherlv_6, grammarAccess.getMemberExprAccess().getCommaKeyword_1_0_3_1_1_0());
            	                    	      							
            	                    	    }
            	                    	    // InternalPaplj.g:1582:8: ( (lv_args_7_0= ruleExpr ) )
            	                    	    // InternalPaplj.g:1583:9: (lv_args_7_0= ruleExpr )
            	                    	    {
            	                    	    // InternalPaplj.g:1583:9: (lv_args_7_0= ruleExpr )
            	                    	    // InternalPaplj.g:1584:10: lv_args_7_0= ruleExpr
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      										newCompositeNode(grammarAccess.getMemberExprAccess().getArgsExprParserRuleCall_1_0_3_1_1_1_0());
            	                    	      									
            	                    	    }
            	                    	    pushFollow(FOLLOW_16);
            	                    	    lv_args_7_0=ruleExpr();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      										if (current==null) {
            	                    	      											current = createModelElementForParent(grammarAccess.getMemberExprRule());
            	                    	      										}
            	                    	      										add(
            	                    	      											current,
            	                    	      											"args",
            	                    	      											lv_args_7_0,
            	                    	      											"org.metaborg.paplj.Paplj.Expr");
            	                    	      										afterParserOrEnumRuleCall();
            	                    	      									
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

            	            otherlv_8=(Token)match(input,23,FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_8, grammarAccess.getMemberExprAccess().getRightParenthesisKeyword_1_0_3_2());
            	              					
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberExpr"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalPaplj.g:1614:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalPaplj.g:1614:52: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalPaplj.g:1615:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalPaplj.g:1621:1: rulePrimaryExpr returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= 'this' ) | ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? ) | ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' ) | ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? ) | this_Block2_22= ruleBlock2 | (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' ) ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

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
        EObject lv_args_18_0 = null;

        EObject lv_args_20_0 = null;

        EObject this_Block2_22 = null;

        EObject this_Expr_24 = null;



        	enterRule();

        try {
            // InternalPaplj.g:1627:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= 'this' ) | ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? ) | ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' ) | ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? ) | this_Block2_22= ruleBlock2 | (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' ) ) )
            // InternalPaplj.g:1628:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= 'this' ) | ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? ) | ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' ) | ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? ) | this_Block2_22= ruleBlock2 | (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' ) )
            {
            // InternalPaplj.g:1628:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) ) | ( () otherlv_6= 'this' ) | ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? ) | ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' ) | ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? ) | this_Block2_22= ruleBlock2 | (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' ) )
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
                    // InternalPaplj.g:1629:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalPaplj.g:1629:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalPaplj.g:1630:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalPaplj.g:1630:4: ()
                    // InternalPaplj.g:1631:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExprAccess().getNumAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPaplj.g:1637:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalPaplj.g:1638:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalPaplj.g:1638:5: (lv_value_1_0= RULE_INT )
                    // InternalPaplj.g:1639:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryExprAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryExprRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPaplj.g:1657:3: ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    {
                    // InternalPaplj.g:1657:3: ( () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' ) )
                    // InternalPaplj.g:1658:4: () ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' )
                    {
                    // InternalPaplj.g:1658:4: ()
                    // InternalPaplj.g:1659:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExprAccess().getBoolAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPaplj.g:1665:4: ( ( (lv_true_3_0= 'true' ) ) | otherlv_4= 'false' )
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
                            // InternalPaplj.g:1666:5: ( (lv_true_3_0= 'true' ) )
                            {
                            // InternalPaplj.g:1666:5: ( (lv_true_3_0= 'true' ) )
                            // InternalPaplj.g:1667:6: (lv_true_3_0= 'true' )
                            {
                            // InternalPaplj.g:1667:6: (lv_true_3_0= 'true' )
                            // InternalPaplj.g:1668:7: lv_true_3_0= 'true'
                            {
                            lv_true_3_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_true_3_0, grammarAccess.getPrimaryExprAccess().getTrueTrueKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPrimaryExprRule());
                              							}
                              							setWithLastConsumed(current, "true", true, "true");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalPaplj.g:1681:5: otherlv_4= 'false'
                            {
                            otherlv_4=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getPrimaryExprAccess().getFalseKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPaplj.g:1688:3: ( () otherlv_6= 'this' )
                    {
                    // InternalPaplj.g:1688:3: ( () otherlv_6= 'this' )
                    // InternalPaplj.g:1689:4: () otherlv_6= 'this'
                    {
                    // InternalPaplj.g:1689:4: ()
                    // InternalPaplj.g:1690:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExprAccess().getThisAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_6=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPrimaryExprAccess().getThisKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalPaplj.g:1702:3: ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? )
                    {
                    // InternalPaplj.g:1702:3: ( () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )? )
                    // InternalPaplj.g:1703:4: () otherlv_8= 'null' ( (otherlv_9= RULE_ID ) )?
                    {
                    // InternalPaplj.g:1703:4: ()
                    // InternalPaplj.g:1704:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExprAccess().getNullAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,39,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getPrimaryExprAccess().getNullKeyword_3_1());
                      			
                    }
                    // InternalPaplj.g:1714:4: ( (otherlv_9= RULE_ID ) )?
                    int alt35=2;
                    alt35 = dfa35.predict(input);
                    switch (alt35) {
                        case 1 :
                            // InternalPaplj.g:1715:5: (otherlv_9= RULE_ID )
                            {
                            // InternalPaplj.g:1715:5: (otherlv_9= RULE_ID )
                            // InternalPaplj.g:1716:6: otherlv_9= RULE_ID
                            {
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getPrimaryExprRule());
                              						}
                              					
                            }
                            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_9, grammarAccess.getPrimaryExprAccess().getTypeTypeCrossReference_3_2_0());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPaplj.g:1729:3: ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' )
                    {
                    // InternalPaplj.g:1729:3: ( () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')' )
                    // InternalPaplj.g:1730:4: () otherlv_11= 'new' ( ( ruleQualifiedName ) ) otherlv_13= '(' otherlv_14= ')'
                    {
                    // InternalPaplj.g:1730:4: ()
                    // InternalPaplj.g:1731:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExprAccess().getNewAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,40,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getPrimaryExprAccess().getNewKeyword_4_1());
                      			
                    }
                    // InternalPaplj.g:1741:4: ( ( ruleQualifiedName ) )
                    // InternalPaplj.g:1742:5: ( ruleQualifiedName )
                    {
                    // InternalPaplj.g:1742:5: ( ruleQualifiedName )
                    // InternalPaplj.g:1743:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryExprRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryExprAccess().getTypeTypeCrossReference_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,21,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_4_3());
                      			
                    }
                    otherlv_14=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_4_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalPaplj.g:1767:3: ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? )
                    {
                    // InternalPaplj.g:1767:3: ( () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )? )
                    // InternalPaplj.g:1768:4: () ( (otherlv_16= RULE_ID ) ) ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )?
                    {
                    // InternalPaplj.g:1768:4: ()
                    // InternalPaplj.g:1769:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryExprAccess().getVarAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalPaplj.g:1775:4: ( (otherlv_16= RULE_ID ) )
                    // InternalPaplj.g:1776:5: (otherlv_16= RULE_ID )
                    {
                    // InternalPaplj.g:1776:5: (otherlv_16= RULE_ID )
                    // InternalPaplj.g:1777:6: otherlv_16= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPrimaryExprRule());
                      						}
                      					
                    }
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_16, grammarAccess.getPrimaryExprAccess().getMemberSymbolCrossReference_5_1_0());
                      					
                    }

                    }


                    }

                    // InternalPaplj.g:1788:4: ( ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==21) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalPaplj.g:1789:5: ( (lv_methodInvocation_17_0= '(' ) ) ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )? otherlv_21= ')'
                            {
                            // InternalPaplj.g:1789:5: ( (lv_methodInvocation_17_0= '(' ) )
                            // InternalPaplj.g:1790:6: (lv_methodInvocation_17_0= '(' )
                            {
                            // InternalPaplj.g:1790:6: (lv_methodInvocation_17_0= '(' )
                            // InternalPaplj.g:1791:7: lv_methodInvocation_17_0= '('
                            {
                            lv_methodInvocation_17_0=(Token)match(input,21,FOLLOW_29); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_methodInvocation_17_0, grammarAccess.getPrimaryExprAccess().getMethodInvocationLeftParenthesisKeyword_5_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getPrimaryExprRule());
                              							}
                              							setWithLastConsumed(current, "methodInvocation", true, "(");
                              						
                            }

                            }


                            }

                            // InternalPaplj.g:1803:5: ( ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )* )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_INT)||LA37_0==19||LA37_0==21||LA37_0==31||(LA37_0>=35 && LA37_0<=41)||LA37_0==43) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // InternalPaplj.g:1804:6: ( (lv_args_18_0= ruleExpr ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )*
                                    {
                                    // InternalPaplj.g:1804:6: ( (lv_args_18_0= ruleExpr ) )
                                    // InternalPaplj.g:1805:7: (lv_args_18_0= ruleExpr )
                                    {
                                    // InternalPaplj.g:1805:7: (lv_args_18_0= ruleExpr )
                                    // InternalPaplj.g:1806:8: lv_args_18_0= ruleExpr
                                    {
                                    if ( state.backtracking==0 ) {

                                      								newCompositeNode(grammarAccess.getPrimaryExprAccess().getArgsExprParserRuleCall_5_2_1_0_0());
                                      							
                                    }
                                    pushFollow(FOLLOW_16);
                                    lv_args_18_0=ruleExpr();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								if (current==null) {
                                      									current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                                      								}
                                      								add(
                                      									current,
                                      									"args",
                                      									lv_args_18_0,
                                      									"org.metaborg.paplj.Paplj.Expr");
                                      								afterParserOrEnumRuleCall();
                                      							
                                    }

                                    }


                                    }

                                    // InternalPaplj.g:1823:6: (otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) ) )*
                                    loop36:
                                    do {
                                        int alt36=2;
                                        int LA36_0 = input.LA(1);

                                        if ( (LA36_0==22) ) {
                                            alt36=1;
                                        }


                                        switch (alt36) {
                                    	case 1 :
                                    	    // InternalPaplj.g:1824:7: otherlv_19= ',' ( (lv_args_20_0= ruleExpr ) )
                                    	    {
                                    	    otherlv_19=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      							newLeafNode(otherlv_19, grammarAccess.getPrimaryExprAccess().getCommaKeyword_5_2_1_1_0());
                                    	      						
                                    	    }
                                    	    // InternalPaplj.g:1828:7: ( (lv_args_20_0= ruleExpr ) )
                                    	    // InternalPaplj.g:1829:8: (lv_args_20_0= ruleExpr )
                                    	    {
                                    	    // InternalPaplj.g:1829:8: (lv_args_20_0= ruleExpr )
                                    	    // InternalPaplj.g:1830:9: lv_args_20_0= ruleExpr
                                    	    {
                                    	    if ( state.backtracking==0 ) {

                                    	      									newCompositeNode(grammarAccess.getPrimaryExprAccess().getArgsExprParserRuleCall_5_2_1_1_1_0());
                                    	      								
                                    	    }
                                    	    pushFollow(FOLLOW_16);
                                    	    lv_args_20_0=ruleExpr();

                                    	    state._fsp--;
                                    	    if (state.failed) return current;
                                    	    if ( state.backtracking==0 ) {

                                    	      									if (current==null) {
                                    	      										current = createModelElementForParent(grammarAccess.getPrimaryExprRule());
                                    	      									}
                                    	      									add(
                                    	      										current,
                                    	      										"args",
                                    	      										lv_args_20_0,
                                    	      										"org.metaborg.paplj.Paplj.Expr");
                                    	      									afterParserOrEnumRuleCall();
                                    	      								
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

                            otherlv_21=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_21, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_5_2_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalPaplj.g:1856:3: this_Block2_22= ruleBlock2
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryExprAccess().getBlock2ParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Block2_22=ruleBlock2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Block2_22;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalPaplj.g:1865:3: (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' )
                    {
                    // InternalPaplj.g:1865:3: (otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')' )
                    // InternalPaplj.g:1866:4: otherlv_23= '(' this_Expr_24= ruleExpr otherlv_25= ')'
                    {
                    otherlv_23=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_7_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getPrimaryExprAccess().getExprParserRuleCall_7_1());
                      			
                    }
                    pushFollow(FOLLOW_31);
                    this_Expr_24=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expr_24;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_25=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_25, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_7_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleIf"
    // InternalPaplj.g:1887:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalPaplj.g:1887:43: (iv_ruleIf= ruleIf EOF )
            // InternalPaplj.g:1888:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalPaplj.g:1894:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_onTrue_4_0= ruleExpr ) ) otherlv_5= 'else' ( (lv_onFalse_6_0= ruleExpr ) ) ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_onTrue_4_0 = null;

        EObject lv_onFalse_6_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:1900:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_onTrue_4_0= ruleExpr ) ) otherlv_5= 'else' ( (lv_onFalse_6_0= ruleExpr ) ) ) )
            // InternalPaplj.g:1901:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_onTrue_4_0= ruleExpr ) ) otherlv_5= 'else' ( (lv_onFalse_6_0= ruleExpr ) ) )
            {
            // InternalPaplj.g:1901:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_onTrue_4_0= ruleExpr ) ) otherlv_5= 'else' ( (lv_onFalse_6_0= ruleExpr ) ) )
            // InternalPaplj.g:1902:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_condition_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_onTrue_4_0= ruleExpr ) ) otherlv_5= 'else' ( (lv_onFalse_6_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalPaplj.g:1910:3: ( (lv_condition_2_0= ruleExpr ) )
            // InternalPaplj.g:1911:4: (lv_condition_2_0= ruleExpr )
            {
            // InternalPaplj.g:1911:4: (lv_condition_2_0= ruleExpr )
            // InternalPaplj.g:1912:5: lv_condition_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getConditionExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_condition_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"condition",
              						lv_condition_2_0,
              						"org.metaborg.paplj.Paplj.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalPaplj.g:1933:3: ( (lv_onTrue_4_0= ruleExpr ) )
            // InternalPaplj.g:1934:4: (lv_onTrue_4_0= ruleExpr )
            {
            // InternalPaplj.g:1934:4: (lv_onTrue_4_0= ruleExpr )
            // InternalPaplj.g:1935:5: lv_onTrue_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getOnTrueExprParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_onTrue_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"onTrue",
              						lv_onTrue_4_0,
              						"org.metaborg.paplj.Paplj.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,42,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getIfAccess().getElseKeyword_5());
              		
            }
            // InternalPaplj.g:1956:3: ( (lv_onFalse_6_0= ruleExpr ) )
            // InternalPaplj.g:1957:4: (lv_onFalse_6_0= ruleExpr )
            {
            // InternalPaplj.g:1957:4: (lv_onFalse_6_0= ruleExpr )
            // InternalPaplj.g:1958:5: lv_onFalse_6_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getOnFalseExprParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_onFalse_6_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"onFalse",
              						lv_onFalse_6_0,
              						"org.metaborg.paplj.Paplj.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleLet"
    // InternalPaplj.g:1979:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // InternalPaplj.g:1979:44: (iv_ruleLet= ruleLet EOF )
            // InternalPaplj.g:1980:2: iv_ruleLet= ruleLet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetRule()); 
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
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalPaplj.g:1986:1: ruleLet returns [EObject current=null] : (otherlv_0= 'let' ( (lv_bindings_1_0= ruleBinding ) )* otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_bindings_1_0 = null;

        EObject lv_expr_3_0 = null;



        	enterRule();

        try {
            // InternalPaplj.g:1992:2: ( (otherlv_0= 'let' ( (lv_bindings_1_0= ruleBinding ) )* otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) ) )
            // InternalPaplj.g:1993:2: (otherlv_0= 'let' ( (lv_bindings_1_0= ruleBinding ) )* otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) )
            {
            // InternalPaplj.g:1993:2: (otherlv_0= 'let' ( (lv_bindings_1_0= ruleBinding ) )* otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) ) )
            // InternalPaplj.g:1994:3: otherlv_0= 'let' ( (lv_bindings_1_0= ruleBinding ) )* otherlv_2= 'in' ( (lv_expr_3_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLetAccess().getLetKeyword_0());
              		
            }
            // InternalPaplj.g:1998:3: ( (lv_bindings_1_0= ruleBinding ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPaplj.g:1999:4: (lv_bindings_1_0= ruleBinding )
            	    {
            	    // InternalPaplj.g:1999:4: (lv_bindings_1_0= ruleBinding )
            	    // InternalPaplj.g:2000:5: lv_bindings_1_0= ruleBinding
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getLetAccess().getBindingsBindingParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_bindings_1_0=ruleBinding();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getLetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"bindings",
            	      						lv_bindings_1_0,
            	      						"org.metaborg.paplj.Paplj.Binding");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_2=(Token)match(input,44,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLetAccess().getInKeyword_2());
              		
            }
            // InternalPaplj.g:2021:3: ( (lv_expr_3_0= ruleExpr ) )
            // InternalPaplj.g:2022:4: (lv_expr_3_0= ruleExpr )
            {
            // InternalPaplj.g:2022:4: (lv_expr_3_0= ruleExpr )
            // InternalPaplj.g:2023:5: lv_expr_3_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetAccess().getExprExprParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_3_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_3_0,
              						"org.metaborg.paplj.Paplj.Expr");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLet"

    // $ANTLR start synpred1_InternalPaplj
    public final void synpred1_InternalPaplj_fragment() throws RecognitionException {   
        // InternalPaplj.g:921:4: ( ( () '=' ( ( ruleExpr ) ) ) )
        // InternalPaplj.g:921:5: ( () '=' ( ( ruleExpr ) ) )
        {
        // InternalPaplj.g:921:5: ( () '=' ( ( ruleExpr ) ) )
        // InternalPaplj.g:922:5: () '=' ( ( ruleExpr ) )
        {
        // InternalPaplj.g:922:5: ()
        // InternalPaplj.g:923:5: 
        {
        }

        match(input,24,FOLLOW_7); if (state.failed) return ;
        // InternalPaplj.g:925:5: ( ( ruleExpr ) )
        // InternalPaplj.g:926:6: ( ruleExpr )
        {
        // InternalPaplj.g:926:6: ( ruleExpr )
        // InternalPaplj.g:927:7: ruleExpr
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
    // $ANTLR end synpred1_InternalPaplj

    // $ANTLR start synpred2_InternalPaplj
    public final void synpred2_InternalPaplj_fragment() throws RecognitionException {   
        // InternalPaplj.g:1483:4: ( ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? ) )
        // InternalPaplj.g:1483:5: ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? )
        {
        // InternalPaplj.g:1483:5: ( () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )? )
        // InternalPaplj.g:1484:5: () '.' ( ( RULE_ID ) ) ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )?
        {
        // InternalPaplj.g:1484:5: ()
        // InternalPaplj.g:1485:5: 
        {
        }

        match(input,14,FOLLOW_3); if (state.failed) return ;
        // InternalPaplj.g:1487:5: ( ( RULE_ID ) )
        // InternalPaplj.g:1488:6: ( RULE_ID )
        {
        // InternalPaplj.g:1488:6: ( RULE_ID )
        // InternalPaplj.g:1489:7: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_32); if (state.failed) return ;

        }


        }

        // InternalPaplj.g:1492:5: ( ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')' )?
        int alt43=2;
        int LA43_0 = input.LA(1);

        if ( (LA43_0==21) ) {
            alt43=1;
        }
        switch (alt43) {
            case 1 :
                // InternalPaplj.g:1493:6: ( ( '(' ) ) ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )? ')'
                {
                // InternalPaplj.g:1493:6: ( ( '(' ) )
                // InternalPaplj.g:1494:7: ( '(' )
                {
                // InternalPaplj.g:1494:7: ( '(' )
                // InternalPaplj.g:1495:8: '('
                {
                match(input,21,FOLLOW_29); if (state.failed) return ;

                }


                }

                // InternalPaplj.g:1498:6: ( ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )* )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_INT)||LA42_0==19||LA42_0==21||LA42_0==31||(LA42_0>=35 && LA42_0<=41)||LA42_0==43) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // InternalPaplj.g:1499:7: ( ( ruleExpr ) ) ( ',' ( ( ruleExpr ) ) )*
                        {
                        // InternalPaplj.g:1499:7: ( ( ruleExpr ) )
                        // InternalPaplj.g:1500:8: ( ruleExpr )
                        {
                        // InternalPaplj.g:1500:8: ( ruleExpr )
                        // InternalPaplj.g:1501:9: ruleExpr
                        {
                        pushFollow(FOLLOW_16);
                        ruleExpr();

                        state._fsp--;
                        if (state.failed) return ;

                        }


                        }

                        // InternalPaplj.g:1504:7: ( ',' ( ( ruleExpr ) ) )*
                        loop41:
                        do {
                            int alt41=2;
                            int LA41_0 = input.LA(1);

                            if ( (LA41_0==22) ) {
                                alt41=1;
                            }


                            switch (alt41) {
                        	case 1 :
                        	    // InternalPaplj.g:1505:8: ',' ( ( ruleExpr ) )
                        	    {
                        	    match(input,22,FOLLOW_7); if (state.failed) return ;
                        	    // InternalPaplj.g:1506:8: ( ( ruleExpr ) )
                        	    // InternalPaplj.g:1507:9: ( ruleExpr )
                        	    {
                        	    // InternalPaplj.g:1507:9: ( ruleExpr )
                        	    // InternalPaplj.g:1508:10: ruleExpr
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
    // $ANTLR end synpred2_InternalPaplj

    // Delegated rules

    public final boolean synpred1_InternalPaplj() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalPaplj_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalPaplj() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalPaplj_fragment(); // can never throw exception
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
            return "405:2: (this_Field_0= ruleField | this_Method_1= ruleMethod )";
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
            return "1714:4: ( (otherlv_9= RULE_ID ) )?";
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