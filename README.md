CamilleX Feature
================
This feature provides a text editor (CamilleX) for Event-B constructs (e.g., XMachines and XContexts).

Release history:
---------------
### 2.1.0 Usability Update  ###
#### Updated Plug-ins/Features ####
- XContext (2.1.0): Attach the markers to the XContext's name if no child element found (see Issue #65).
- XContext UI (2.1.0): Added handler to insert Event-B symbols into XContext Editor (see Issue #67).
- XMachine (2.1.0): Attach the markers to the XMachine's name if no child element found (see Issue #65).
- XMachine UI (2.1.0): Added handler to insert Event-B symbols into XMachine Editor (see Issue #67).
- CamilleX UI (1.1.0): 
  + Added a context menu item to do the batch generation of CamilleX source files (see Issue #63).
  + Added common implementation for a handler to insert Event-B Symbols to a text editor (see Issue #67).
#### Fixed Issues ####
- Issue #63: Batch generation for a collection of CamilleX source files.
- Issue #65: Markers attach to an XMachine or an XContext.
- Issue #67: SymbolTable does not work with CamilleX editors
### 2.0.2 Maintenance release ###
- Fixed the Update Site name.
- Removed the included features: Inclusion, Records, Containment
#### Updated Plug-ins ####
- XContext (2.0.2):
  + Added extra dependency on the Record Edit Plug-in.
- XMachine (2.0.2):
  + Added extra dependency on the Inclusion Edit Plug-in.
  + Added extra dependency on the Record Edit Plug-in.
  + Added extra dependency on the Containment Edit Plug-in.
- XMachine UI (2.0.1):
  + Update dependency range for org.eventb.core.emf.
### 2.0.1 Maintenance release ###
#### Updated Plugins/Features ####
- Branding (0.0.5): Update copyright information on branding.
- XContext (2.0.1):
  + Added missing dependency.
  + Fixed NPE in XContextMarkerModule.
- XMachine (2.0.1):
  + Added missing dependency.
  + Fixed NPE in XContextMarkerModule.
### 2.0.0 ###
Enhancement to CamilleX to improve its usability.
- Issue #6: Show inherited information for extended events as hover information.
- Issue #50: Show errors/warnings from Rodin components in CamilleX components.
- Issue #51: Show warnings for untranslated formulae (predicates, expressions, assignments).
- Support for records (in XContexts and XMachines).
- Support for containment mechanisms (enabling external modelling extensions, e.g., UML-B models).
#### Fixed Issues ####
- Issue #33: Errors in the generated Machine.
- Issue #36: Exceptions when projects are closed.
#### Updated Plugins/Features ####
- EMF Inclusion Feature (2.0.0): Added
- EMF Containment Feature (0.0.1): Initial version
- Records Feature (0.1.0): Initial version
- Common (1.0.0):
  + Added validation issue code (used for validation and quick fixes).
- UI (1.0.0): Pumped the version number due to API breakage in earlier version.
- XContext (2.0.0): Pumped the version number due to API breakage in earlier version.
  + Issue #50: Show errors/warnings from Rodin Machine in XMachine.
  + Issue #51: Show warnings for untranslated formulae (predicates).
- XContext IDE (2.0.0): Pumped the version number due to API breakage in earlier version.
- XContext UI (2.0.0): Pumped the version number due to API breakage in earlier version.
  + Issue #51: Quick fixes for untranslated formulae (predicates)
- XMachine (2.0.0): Pumped the version number due to API breakage in earlier version.
  + Issue #6: Show inherited information for extended events as hover information.
  + Issue #33: Errors in the generated Machine.
  + Issue #50: Show errors/warnings from Rodin Machine in XMachine.
  + Issue #51: Show warnings for untranslated formulae (predicates, expressions, assignments)
  + Support for records in XMachines.
  + Support for containment mechanisms (enabling external modelling extensions, e.g., UML-B models).
- XMachine IDE (1.0.0): Pumped the version number due to API breakage in earlier version.
- XMachine UI (2.0.0): Pumped the version number due to API breakage in earlier version.
  + Issue #51: Quick fixes for untranslated formulae (predicates, expressions, assignments)
### 1.0.0 ###
The feature is now called CamilleX (instead of XEvent-B).
- Branding (0.0.4): Updated logo to CamilleX.
- Common (0.0.5): Update copyright statements in source code.
- Cheatsheets (1.0.0): Updated the name to use CamilleX instead of XEvent-B.
- Documentation (1.0.0): Updated the name to use CamilleX instead of XEvent-B.
- UI (0.1.0): Updated the name to use CamilleX instead of XEvent-B.
- XContext (1.0.0): Updated the name to use CamilleX instead of XEvent-B.
  + Update dependency ranges
- XContext IDE (1.0.0): Updated the name to use CamilleX instead of XEvent-B.
  + Update dependency ranges
- XContext UI (1.0.0): Updated the name to use CamilleX instead of XEvent-B.
  + Update dependency ranges
- XMachine (1.0.0): Updated the name to use CamilleX instead of XEvent-B.
+ Update dependency ranges

### 0.0.7 ###
- XEvent-B Branding (0.0.3): Updated logo to XEvent-B.
- XEvent-B Common (0.0.4): Enhancement (Issue #11).
    + Machines from different projects can now be included.
    + Machines are now included using qualified name defined as: projectName.machineName
- XEvent-B Documentations (0.0.7): Update documentation for 0.0.7 release.
- XEvent-B XContext (0.0.5): Changed dependency on XText to [2.12.0, 3.0.0).
- XEvent-B XContext IDE (0.0.4): Changed dependency on XText to [2.12.0, 3.0.0).
- XEvent-B XContext UI (0.0.4): Changed dependency on XText to [2.12.0, 3.0.0).
- XEvent-B XMachine (0.0.5):
    + Changed dependency on XText to [2.12.0, 3.0.0).
    + Fixed Issue #8: Comments are not parsed.
    + Fixed Issue #10: Variants not translated: Fix is part of inclusion plug-in release 0.2.0.
    + Flattened machines now have the included machine elements generated before the source machine.
    + Order of generating elements of multiple inclusions and/or instances is from last to first.
    + This update is part of inclusion plug-in release 0.2.0.
- XEvent-B XMachine IDE (0.0.4): Changed dependency on XText to [2.12.0, 3.0.0).
- XEvent-B XMachine UI (0.0.4): 
    + Changed dependency on XText to [2.12.0, 3.0.0).
    + Regenerated from XEvent-B XMachine 0.0.5

### 0.0.6 ###
- Renamed plug-ins and features to XEvent-B (instead of Event-B XText).
- XEvent-B Branding (0.0.2): Renamed from Event-B XText Branding.
- XEvent-B Documentations (0.0.2): Renamed from Event-B XText Documentations.
- XEvent-B Cheatsheets (0.0.2): Renamed from Event-B XText Cheatsheets.
- XEvent-B Common (0.0.3): Renamed from Event-B XText Common.
- XEvent-B UI (0.0.2): Renamed from Event-B XText UI.
- XEvent-B XContext (0.0.4): Renamed from Event-B XText Context.
- XEvent-B XContext IDE (0.0.3): Renamed from Event-B XText Context IDE.
- XEvent-B XContext UI (0.0.3): Renamed from Event-B Context UI.
- XEvent-B XMachine (0.0.4): Renamed from Event-B XText Machine.
    + Support Machine Inclusion and Event Synchronisation.
- XEvent-B XMachine IDE (0.0.3): Renamed from Event-B XText Machine IDE.
- XEvent-B XMachine UI (0.0.3): Renamed from Event-B XText Machine UI.

### 0.0.5 ###
- Event-B XText Documentations (0.0.1): Documentation plug-in (Initial version).
- Event-B XText Cheatsheets (0.0.1): Cheatsheets plug-in including Basic tutorial (Initial version).

### 0.0.4 ###
- Updated plug-in dependency for the feature

### 0.0.3 ###
- Event-B XText Context (0.0.3) 
    + Issue #3: Single-line comment after the element, multi-line comment before the element
- Event-B XText Context IDE (0.0.2) Regenerated
- Event-B XText ContextUI IDE (0.0.2) Regenerated
- Event-B XText Machine (0.0.3) 
    + Issue #3: Single-line comment after the element, multi-line comment before the element
    + Issue #5: Event terminator using 'end' keyword instead of ';'
- Event-B XText Machine IDE (0.0.2) Regenerated
- Event-B XText Machine UI (0.0.2) Regenerated

### 0.0.2 ###
- Event-B XText Common (0.0.2)
    + Added transient value service for XContext and XMachine.
- Event-B XText Context (0.0.2):
    + Added formatter (used for auto-indentation).
- Event-B XText Machine (0.0.2):
    + Added formatter (used for auto-indentation).
- Event-B XText UI (0.0.1): Initial version
    + Added context menu for converting machines and contexts to XText.

### 0.0.1 Initial version contains the following plug-ins: ###
- Event-B XText Branding (0.0.1) Initial version: Branding information
- Event-B XText Common (0.0.1) Initial version: Common facilities
- Event-B XText Context (0.0.1) Initial version: Core support for Event-B contexts
- Event-B XText Context IDE (0.0.1) Initial version: IDE for Event-B contexts
- Event-B XText Context UI (0.0.1) Initial version: UI for Event-B contexts
- Event-B XText Machine (0.0.1) Initial version: Core support for Event-B machines
- Event-B XText Machine IDE (0.0.1) Initial version: IDE for Event-B machines
- Event-B XText Machine UI (0.0.1) Initial version: UI for Event-B machines
